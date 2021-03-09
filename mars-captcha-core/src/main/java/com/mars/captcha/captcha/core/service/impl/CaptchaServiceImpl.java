package com.mars.captcha.captcha.core.service.impl;

import com.mars.captcha.captcha.core.service.CaptchaService;
import com.mars.captcha.captcha.core.utils.ValidateCode;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2021/3/6 22:27
 */
@Service
public class CaptchaServiceImpl implements CaptchaService {

    @Resource
    private HttpServletRequest request;

    @Resource
    private ValidateCode validateCode;

    @Resource
    private HttpServletResponse response;

    public static final String CAPTCHA_NAME = "captcha";

    public static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>(1);


    @Override
    public void acquire() {
        try {
            response.setContentType("image/png");
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Expire", "0");
            response.setHeader("Pragma", "no-cache");
            map.clear();
            //直接返回图片
            String randomCode = validateCode.getRandomCodeImage(request, response);
            map.put(CAPTCHA_NAME, randomCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean check(String code) {
        String captchaCode = map.get(CAPTCHA_NAME);
        if (!StringUtils.isEmpty(captchaCode)) {
            return captchaCode.equals(code);
        }
        return false;
    }
}

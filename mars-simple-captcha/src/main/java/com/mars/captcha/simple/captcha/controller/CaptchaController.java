package com.mars.captcha.simple.captcha.controller;

import com.mars.captcha.captcha.core.service.CaptchaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wq
 * @version 1.0
 * @date 2021/03/09 18:05
 */
@RestController
public class CaptchaController {

    @Resource
    private CaptchaService captchaService;

    /**
     * 1.手写生成验证码
     */
    @RequestMapping("/acquire")
    public void acquire() {
        captchaService.acquire();
    }

    /**
     * 校验验证码
     *
     * @return boolean
     */
    @GetMapping("/check")
    public boolean check(String code) {
        return captchaService.check(code);
    }
}

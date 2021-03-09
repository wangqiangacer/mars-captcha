package com.mars.captcha.captcha.core.service;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2021/3/6 22:26
 */
public interface CaptchaService {

    /**
     * 获取验证码
     */
    void acquire();


    /**
     * 校验验证码
     *
     * @return boolean
     */
    boolean check(String code);

}

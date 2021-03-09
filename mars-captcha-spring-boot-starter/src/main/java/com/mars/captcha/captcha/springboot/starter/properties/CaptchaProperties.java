package com.mars.captcha.captcha.springboot.starter.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wq
 * @version 1.0
 * @date 2021/03/08 15:07
 */
@Data
@ConfigurationProperties("mars.captcha")
public class CaptchaProperties {

    /**
     * 宽度
     */
    private int width;

    /**
     * 高度
     */
    private int height;

    /**
     * 干扰线数量
     */
    private int lineSize;

    /**
     * 字符数量
     */
    private int charNum;

    /**
     * 字符类型
     */
    private String charType;
}

package com.mars.captcha.captcha.springboot.starter.configuration;


import com.mars.captcha.captcha.springboot.starter.properties.CaptchaProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties({CaptchaProperties.class})
@ConditionalOnProperty(value = "mars.captcha", havingValue = "true")
public class CaptchaConfiguration {


}

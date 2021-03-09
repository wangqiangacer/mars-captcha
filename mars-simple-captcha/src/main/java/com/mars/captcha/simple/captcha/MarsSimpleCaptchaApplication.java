package com.mars.captcha.simple.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mars.captcha")
public class MarsSimpleCaptchaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsSimpleCaptchaApplication.class, args);
    }

}

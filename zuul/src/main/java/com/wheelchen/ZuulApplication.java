package com.wheelchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Kelvin Chen
 * @date 2020-02-24 17:02:38
 *
 * `@EnableZuulProxy` 包含了@EnableZuulServer，设置该类为网关的启动类。
 * `@EnableAutoConfiguration` 帮助Spring Boot应用将所有符合条件的@Configuration自动加载到当前应用
 *  创建的IOC容器中
 */

@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
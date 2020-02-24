package me.wheelchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Kelvin Chen
 * @date 2019-11-03 23:44:25
 *
 * SpringBootApplication  - 声明Spring Boot服务的入口。
 * EnableEurekaServer - 声明该类为Eureka Service微服务，提供注册服务和注册发现即注册中心。
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}

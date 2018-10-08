package com.yue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: zhangyue
 * @date: 2018/10/8 17:07
 * @description:
 */
@SpringBootApplication
@EnableConfigServer
public class springcloudconfig3344_app {
    public static void main(String[] a) {
        SpringApplication.run(springcloudconfig3344_app.class, a);
    }
}

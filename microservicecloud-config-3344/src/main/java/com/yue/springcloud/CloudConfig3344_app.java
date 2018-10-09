package com.yue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: zhangyue
 * @date: 2018/10/8 17:07
 * @description:
 * /{application}-{profile}.yml   http://config-3344.com:3344/application-test.yml
 * /{application}/{profile}[/{label}]  http://config-3344.com:3344/application/dev/master
 * /{label}/{application}-{profile}.yml   http://config-3344.com:3344/master/application-test.yml
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfig3344_app {
    public static void main(String[] a) {
        SpringApplication.run(CloudConfig3344_app.class, a);
    }
}

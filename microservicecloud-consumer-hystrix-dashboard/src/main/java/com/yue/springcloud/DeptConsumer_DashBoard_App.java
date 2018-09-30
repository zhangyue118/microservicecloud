package com.yue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: zhangyue
 * @date: 2018/9/30 10:48
 * @description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] a) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class, a);
    }
}

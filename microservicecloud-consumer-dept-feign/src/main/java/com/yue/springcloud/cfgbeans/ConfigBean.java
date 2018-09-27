package com.yue.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhangyue
 * @date: 2018/9/19 15:39
 * @description:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        //随机算法替代默认的轮询
        //return new RandomRule();
        return new RetryRule();
    }

}

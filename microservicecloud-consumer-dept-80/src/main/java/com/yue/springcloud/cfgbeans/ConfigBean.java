package com.yue.springcloud.cfgbeans;

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
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}

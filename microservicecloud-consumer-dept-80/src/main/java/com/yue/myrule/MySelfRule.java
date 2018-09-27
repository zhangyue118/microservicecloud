package com.yue.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhangyue
 * @date: 2018/9/27 10:56
 * @description: 自定义配置类不能放在@ComponentScan所扫描的当前包及其子包下，否则自定义的这个配置类会被所有Ribbon客户端共享
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //Ribbon默认轮询，自定义为随机
        //return new RandomRule();
        //自定义5次一轮询
        return new RandomRule_ZY();
    }
}

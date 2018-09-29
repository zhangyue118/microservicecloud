package com.yue.springcloud.service;

import com.yue.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: zhangyue
 * @date: 2018/9/29 16:10
 * @description:
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDeptno(id)
                        .setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDbSource("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}


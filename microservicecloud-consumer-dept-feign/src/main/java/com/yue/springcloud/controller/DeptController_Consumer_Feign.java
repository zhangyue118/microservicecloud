package com.yue.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yue.springcloud.entities.Dept;
import com.yue.springcloud.service.DeptClientService;

/**
 * @author: zhangyue
 * @date: 2018/9/19 15:43
 * @description:
 */
@RequestMapping("/consumer")
@RestController
public class DeptController_Consumer_Feign {

    @Autowired
    private DeptClientService service = null;

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/dept/add")
    public Object add(Dept dept) {
        return this.service.add(dept);
    }

}

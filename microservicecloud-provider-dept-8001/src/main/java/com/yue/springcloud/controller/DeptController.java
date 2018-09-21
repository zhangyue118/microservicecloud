package com.yue.springcloud.controller;

import com.yue.springcloud.entities.Dept;
import com.yue.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zhangyue
 * @date: 2018/9/19 13:55
 * @description:
 */
@RequestMapping("/dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value="/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> list=discoveryClient.getServices();
        List<ServiceInstance> ltServiceInstance=discoveryClient.getInstances("microservicecloud-dept");
        for(ServiceInstance s:ltServiceInstance){
            System.out.println(s.getServiceId()+"\t"+s.getHost()+"\t"+s.getMetadata()+"\t"+s.getPort()+"\t"+s.getUri());
        }
        return this.discoveryClient;
    }

}

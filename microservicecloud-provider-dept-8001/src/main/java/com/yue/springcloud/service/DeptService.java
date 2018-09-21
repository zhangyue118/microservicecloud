package com.yue.springcloud.service;

import com.yue.springcloud.entities.Dept;

import java.util.List;

/**
 * @author: zhangyue
 * @date: 2018/9/19 13:49
 * @description:
 */
public interface DeptService {

    /**
     * 添加一个部门
     * @param dept 部门类
     * @return boolean 是否成功
     */
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}

package com.yue.springcloud.service.impl;

import com.yue.springcloud.dao.DeptDao;
import com.yue.springcloud.entities.Dept;
import com.yue.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangyue
 * @date: 2018/9/19 13:53
 * @description:
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}

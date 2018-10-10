package com.yue.springcloud.dao;

import com.yue.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: zhangyue
 * @date: 2018/9/19 13:33
 * @description:
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}

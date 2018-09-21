package com.yue.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Dept (lombok)必须序列化
 *
 * @author zhangyue
 * @date 2018/09/19
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    /**
     * 主键
     */
    private Long  deptno;
    /**
     * 部门名称
     */
    private String  dname;
    /**
     * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     */
    private String  dbSource;

}

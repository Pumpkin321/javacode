package com.dao;

import com.domain.Emp;
import com.domain.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {
    //注解开发
//    @Select("select * from orders where eid = #{eid}")
//    public List<Order> findByEid(int eid);

//    @Select("select *,o.id oid from orders o,emp e where o.eid=e.id")
//    @Results({
//            @Result(column = "oid",property = "id"),
//            @Result(column = "ordertime",property = "ordertime"),
//            @Result(column = "total",property = "total"),
//            @Result(column = "eid",property = "emp.id"),
//            @Result(column = "name",property = "emp.name"),
//            @Result(column = "birthday",property = "emp.birthday"),
//    })

    //    @Select("select * from orders ")
    @Results({
            @Result(column = "oid",property = "id"),
            @Result(column = "ordertime",property = "ordertime"),
            @Result(column = "total",property = "total"),
            @Result(
                    property = "emp",//封装的属性名称
                    column = "eid",//根据哪个字段进行查询emp表数据
                    javaType = Emp.class,//要封装的实体类型
                    //select属性代表查询哪个接口的方法去获得对应想获得数据
                    one = @One(select = "com.dao.EmpMapper.findById" )

            )
    })
    public List<Order> findAll();
}

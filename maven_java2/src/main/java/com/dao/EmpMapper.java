package com.dao;

import com.domain.Emp;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper {
    public void save(Emp emp);

    public Emp findById(int id);


    //注解开发
//    @Select("select * from emp")
//    @Results({
//            @Result(id = true, column = "id", property = "id"),
//            @Result(column = "name", property = "name"),
//            @Result(column = "birthday", property = "birthday"),
//            @Result(
//                    property = "orderList",
//                    column = "id",
//                    javaType = List.class,
//                    many = @Many(select = "com.dao.OrderMapper.findByEid")
//            )
//    })
    public List<Emp> findAll();
    @Select("select * from emp")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "birthday",property = "birthday"),
            @Result(
                    property = "roleList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.dao.RoleMapper.findByEid")
            )
    })
    public List<Emp> findEmpAndRoleAll();
}

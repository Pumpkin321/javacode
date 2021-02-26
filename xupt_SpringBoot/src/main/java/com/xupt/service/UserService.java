package com.xupt.service;

import com.xupt.mapper.UserMapper;
import com.xupt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/29 17:33
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //根据id查询
    public User findById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findAll(){
        return userMapper.selectAll();
    }

    //新增保存用户
    @Transactional
    public void saveUser(User user){
        System.out.println("新增用户");
        //选择性新增 如果属性为空则不会出现在insert语句上
        userMapper.insertSelective(user);
    }
}

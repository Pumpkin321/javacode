package com.dao;

import com.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    public List<User> findAll() throws IOException;
    public User findById(int id);
    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);
}

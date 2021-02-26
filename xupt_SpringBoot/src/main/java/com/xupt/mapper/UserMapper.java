package com.xupt.mapper;

import com.xupt.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/29 17:47
 */

@Repository
public interface UserMapper extends Mapper<User> {

}

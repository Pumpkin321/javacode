package xupt.service;

import xupt.domain.User;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:33
 */

public interface UserService {
    List<User> list();

    Long save(User user, Long[] roleIds);


    void del(Long userId);
}

package xupt.dao;

import xupt.domain.User;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:35
 */

public interface UserDao {
    List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long userId, Long[] roleIds);

    void delUserRoleRel(Long userId);

    void delById(Long userId);
}

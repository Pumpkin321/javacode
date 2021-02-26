package xupt.dao;

import xupt.domain.Role;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:09
 */

public interface RoleDao {
    public List<Role> findAll();

    void save(Role role);


    List<Role> findRoleByID(Long id);
}

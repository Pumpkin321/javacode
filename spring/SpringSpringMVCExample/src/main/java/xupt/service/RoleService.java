package xupt.service;

import xupt.domain.Role;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:07
 */

public interface RoleService {
    public List<Role> list();
    void save(Role role);
}

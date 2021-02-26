package xupt.service.impl;

import xupt.dao.RoleDao;
import xupt.domain.Role;
import xupt.service.RoleService;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:08
 */

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }
}

package xupt.service.impl;

import xupt.dao.RoleDao;
import xupt.dao.UserDao;
import xupt.domain.Role;
import xupt.domain.User;
import xupt.service.UserService;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:34
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userList中的每一个User的roles数据
        for (User user:userList){
            //获得User的id
            Long id = user.getId();
            //将ID作为参数查询当前userID对应的Role集合数据
            List<Role> roles = roleDao.findRoleByID(id);
            user.setRoles(roles);
        }
        return userList;
    }

    @Override
    public Long save(User user, Long[] roleIds) {
        //第一步 向user表存储数据
        Long userId = userDao.save(user);
        //第二步 向user_role表存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);
        return null;
    }

    @Override
    public void del(Long userId) {
        //第一步 删除关系表数据
        userDao.delUserRoleRel(userId);
        //第二部 删除user表
        userDao.delById(userId);
    }
}

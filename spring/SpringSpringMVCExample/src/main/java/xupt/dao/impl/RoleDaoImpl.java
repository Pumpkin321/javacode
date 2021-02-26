package xupt.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import xupt.dao.RoleDao;
import xupt.domain.Role;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:10
 */

public class RoleDaoImpl implements RoleDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Role> findAll() {
        List<Role> roleList = jdbcTemplate.query("select * from role", new BeanPropertyRowMapper<Role>(Role.class));
        return roleList;
    }

    @Override
    public void save(Role role) {
        jdbcTemplate.update("insert into role values (?,?,?)",null,role.getRoleName(),role.getRoleDescribe());
    }

    @Override
    public List<Role> findRoleByID(Long id) {
        List<Role> roles = jdbcTemplate.query("select * from user_role ur,role r where ur.roleId=r.id and ur.userId=? ", new BeanPropertyRowMapper<Role>(Role.class), id);
        return roles;
    }
}

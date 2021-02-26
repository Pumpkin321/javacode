package com.dao;

import com.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    @Select("select * from emp_role er,role r where er.role_id=r.id and er.emp_id=#{eid}")
    public List<Role> findByEid(int eid);
}

package com.dao;

import com.domain.Stu;
import com.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StuMapper {
//    @Insert("insert into stu values (#{id},#{name},#{phoneNum})")
    public void save(Stu stu);
//    @Update("update stu set name = #{name},phoneNum=#{phoneNum} where id = #{id}")
    public void update(Stu stu);
//    @Delete("delete from stu where id = #{id}")
    public void delete(int id);
//    @Select("select * from stu where id=#{id}")
    public Stu findById(int id);
//    @Select("select * from stu")
    public List<Stu> findAll();
}

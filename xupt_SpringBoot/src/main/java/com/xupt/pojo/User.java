package com.xupt.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/26 17:43
 */

//类在编译的阶段会根据注解自动生成对应的方法 data包含get、set、hashCode、equals、toString方法

@Data
@Table(name = "tb_user")
public class User {

    @Id
    //主键回填
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    //user_name --> userName
    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private Date birthday;

    private String note;

    private Date created;

    private Date updated;
}

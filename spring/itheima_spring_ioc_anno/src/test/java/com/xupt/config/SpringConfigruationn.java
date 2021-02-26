package com.xupt.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 15:05
 */
//标识该类是Spring的核心配置类
@Configuration
//<!--配置组件扫描-->
//    <context:component-scan base-package="com.xupt"/>
@ComponentScan("com.xupt")
//<import source="">
@Import(DataSourceConfigruation.class)
public class SpringConfigruationn {



}

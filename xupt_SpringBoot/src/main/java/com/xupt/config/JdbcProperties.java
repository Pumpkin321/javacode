package com.xupt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/26 16:39
 */
/*
    ConfigurationProperties 从application配置文件中读取配置项
    prefix 表示配置项前缀(jdbc.)
    配置项类中的类变量名必须要与 前缀之后的配置项名称保存 松散绑定（相同）


 */
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

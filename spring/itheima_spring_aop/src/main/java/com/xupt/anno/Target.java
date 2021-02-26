package com.xupt.anno;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 16:18
 */
@Component("target")
public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
    }
}

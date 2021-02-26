package com.xupt.test;

import com.xupt.anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 18:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.XML")
public class AnnoTest {
    @Autowired
    private TargetInterface target;
    @Test
    public void test1(){
        target.save();
    }
}

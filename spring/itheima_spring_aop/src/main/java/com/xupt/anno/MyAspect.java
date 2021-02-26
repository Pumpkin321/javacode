package com.xupt.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 17:28
 */
@Component("myAspect")
@Aspect //标注当前MyAspect是一个切面类
public class MyAspect {

    //配置前置增强
    @Before("pointcut()")
    public void before(){
        System.out.println("前置增强。。。。");
    }

    public void afterReturning(){
        System.out.println("后置通知。。。。");
    }
    //ProceedingJoinPoint 正在执行的连接点===切入点
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("环绕前增强。。。");
//        //切点方法
//        Object proceed = pjp.proceed();
//        System.out.println("环绕后增强。。。");
//        return proceed;
//    }

//    public void afterThrowing(){
//        System.out.println("异常抛出增强。。。");
//    }
    @After("MyAspect.pointcut()")
    public void after(){
        System.out.println("最终增强。。。");
    }

    @Pointcut("execution(* com.xupt.anno.*.*(..))")
    public void pointcut() {}


}

package com.xupt.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 16:21
 */
public class ProxyTest {
    public static void main(final String[] args) {
        //创建目标对象
        final Target target = new Target();
        //增强对象
        final Advice advice = new Advice();
        //返回值 就是动态生成的代理对象 基于cglib
        //1创建增强器
        Enhancer enhancer = new Enhancer();
        //2设置父类（目标）
        enhancer.setSuperclass(Target.class);
        //3设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //执行前置
                advice.before();
                Object invoke = method.invoke(target, args);//执行目标
                //执行后置
                advice.afterReturning();
                return invoke;
            }
        });
        //4创建代理对象
        Target proxy = (Target) enhancer.create();
        proxy.save();

    }
}

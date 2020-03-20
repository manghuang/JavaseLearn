package com.javase.learn.CGLIB;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time:"+ System.currentTimeMillis());
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("end time:"+ System.currentTimeMillis());
        return obj;
    }
}

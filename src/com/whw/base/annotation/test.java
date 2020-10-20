package com.whw.base.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "com.javase.learn.annotation.demo1", methodName = "show")
public class test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<test> testClass = test.class;
        Pro pro = testClass.getAnnotation(Pro.class);
        String className = pro.className();
        String methodName = pro.methodName();
        System.out.println(className);
        System.out.println(methodName);

        Class<?> cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}

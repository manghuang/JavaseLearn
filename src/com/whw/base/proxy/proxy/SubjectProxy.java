package com.whw.base.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler {
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----------------开始---------------------");
        Object invoke = method.invoke(subject, args);
        System.out.println("----------------结束---------------------");
        return invoke;
    }
}

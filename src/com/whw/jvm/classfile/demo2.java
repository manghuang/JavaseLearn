package com.whw.jvm.classfile;

public class demo2 extends demo1{
    static {
        System.out.println("demo2 静态代码块执行...");
    }

    public demo2(){
        System.out.println("demo2 构造函数执行...");
    }
}

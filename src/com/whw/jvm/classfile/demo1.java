package com.whw.jvm.classfile;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static final double PI = 3.1415926;
    public static final String NAME = "JVM";
    public static final List<Integer> LIST = new ArrayList<>();
    
//    private static int staticNum = 1;
//    private int num = 1;
    
    static {
//        System.out.println("demo1 staticNum:" + staticNum);
//        staticNum = 2;
//        System.out.println("demo1 staticNum:" + staticNum);
        System.out.println("demo1 静态代码块执行...");
    }
    
    public demo1() {
//        System.out.println("demo1 num:" + num);
//        num = 2;
//        System.out.println("demo1 num:" + num);
        System.out.println("demo1 构造函数执行...");
    }

}

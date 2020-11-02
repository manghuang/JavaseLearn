package com.whw.jvm.classfile;

public class demo3 {

    public static void main(String[] args) {
        new demo1();        //静态代码块->构造函数
        new demo1();        //构造函数
        System.out.println(demo1.NAME);   //直接输出
        System.out.println(demo1.PI);     //直接输出
        System.out.println(demo1.LIST);   //执行demo1的静态代码块
        new demo2();        //父类的静态代码块->自己的静态代码块->父类的构造函数->自己的构造函数
        new demo2();        //自己的静态代码块->自己的构造函数
        System.out.println(demo2.NAME);     //直接输出
        System.out.println(demo2.PI);       //直接输出
        System.out.println(demo2.LIST);     //执行demo1的静态代码块
        demo1[] demo1s = new demo1[2]; // 不会触发demo1的静态代码块和构造函数
    }
}

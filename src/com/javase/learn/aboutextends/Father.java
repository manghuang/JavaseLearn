package com.javase.learn.aboutextends;

public class Father {
    //成员变量
    private int a = 10;
    public String name = "父类";

    //默认构造方法
    //父类中必须提供默认构造方法
    public Father(){

    }

    //有参构造方法
    public Father(int a, String name) {
        this.a = a;
        this.name = name;
    }

    //成员方法
    public void getA(){
        System.out.println(this.a);
        System.out.println("定义在父类中的普通方法");
    }
//    public void methodCI(){
//        System.out.println("定义在父类中的methodCI方法");
//    }
}

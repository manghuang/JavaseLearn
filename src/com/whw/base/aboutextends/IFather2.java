package com.whw.base.aboutextends;

public interface IFather2 {
    /*
     ---------JDk1.7-----------
     */
    //常量,可省略public static final
    //接口中定义的成员变量均为常量
    double PI = 3.1415926;
    String name = "父接口2";

    //抽象方法,可省略public abstract
    //实现类要覆盖重写接口中的抽象方法
    void method1();

    /*
     ---------JDk1.8-----------
     */
    //默认方法,可省略public
    //会被实现类继承下去,可以被覆盖重写
    default void method2(){
        System.out.println("定义在父接口2中的默认方法");
    }

    //静态方法,可省略public
    //不能被实现类继承，通过接口名称直接调用
    static void method3(){
        System.out.println("定义在父接口2中的静态方法");
    }

    /*
     ---------JDk1.9-----------
     */
    /*
    //私有方法
    //默认私有方法
    //抽取默认方法的公共部分
    private void method4(){

    }

    //静态私有方法
    //抽取静态方法的公共部分
    private static  void method5(){

    }
    */
}

package com.whw.base.aboutextends;



public class Son extends Father implements ISon1,ISon2{
    //成员变量
    private int a = 1;
    private String name = "子类";

    //默认构造方法
    public Son() {
    }

    //有参构造方法
    public Son(int a, String name, int a1) {
        super(a, name);
        this.a = a1;
    }

    //成员方法
    /*
     必须实现父类的抽象方法,可以覆盖重写父类中的普通方法
     必须实现接口的抽象方法,可以覆盖重写接口中的默认方法，如果多个接口中的默认方法命名一样，必须覆盖重写
     */
    //覆盖重写父类的方法
    @Override
    public void getA() {
        System.out.println(this.a);
        System.out.println("子类覆盖重写父类的方法");
    }

    //实现接口中的抽象方法
    //子接口1和2中均有此抽象方法，只需要实现一次
    @Override
    public void method1() {
        System.out.println("子类实现接口中的抽象方法");
    }

    //覆盖重写接口中的默认方法
    //子接口1和2中均有此默认方法,则必须覆盖重写
    @Override
    public void method2() {
        System.out.println("子类覆盖重写接口的默认方法");
    }

    //覆盖重写父类的方法/接口中的默认方法
//    public void methodCI(){
//        System.out.println("定义在子类中的methodCI方法");
//    }
    //主方法
    public static void main(String[] args) {
        Son son = new Son();
        //优先调用自己类中写的方法
        //如果没有，则沿着继承关系向上找
        //如果还没有，则去接口的默认方法中找
        son.methodCI();
    }
}

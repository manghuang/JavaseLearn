package com.whw.base.aboutextends;

public interface ISon1 extends IFather1,IFather2 {

    //可以覆盖重写父接口中的默认方法，如果多个父接口中的默认方法命名一样，必须覆盖重写
    @Override
    default void method2() {
        System.out.println("定义在子接口1中的默认方法");
    }
    default void methodCI(){
        System.out.println("定义在子接口1中的methodCI方法");
    }
}

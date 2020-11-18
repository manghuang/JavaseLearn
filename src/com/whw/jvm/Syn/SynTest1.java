package com.whw.jvm.Syn;

public class SynTest1 {

    public void test1(){
        synchronized (this){
            System.out.println("放在代码块中");
        }
    }
    public synchronized void test2(){
        System.out.println("放在方法上");
    }

    public static void main(String[] args) {
        new SynTest1();
    }
}

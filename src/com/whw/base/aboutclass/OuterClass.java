package com.whw.base.aboutclass;

import java.util.ArrayList;
import java.util.Objects;

//外部类
public class OuterClass {

    //常量
    public  static  final double PI = 3.141592654;

    //静态成员变量
    private static int num;

    //普通成员变量
    private int age;
    private String name ;
    private ArrayList<String> arrayList;

    //静态代码块
    static {
        num = 10;
    }

    //静态成员方法
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        OuterClass.num = num;
    }

    //构造方法
    public OuterClass(int age, String name, ArrayList<String> arrayList) {
        this.age = age;
        this.name = name;
        this.arrayList = arrayList;
    }

    //普通成员方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public void method(){
        //局部变量
        int age = 1;

        //局部内部类
        class MethodInnerClass{
            //成员变量
            private int age;

            //构造方法
            public MethodInnerClass(int age) {
                this.age = age;
            }

            //成员方法
            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
    }

    //成员内部类
    public class InnerClass{
        //成员变量
        private int age;

        //构造方法
        public InnerClass(int age) {
            this.age = age;
        }

        //成员方法
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    //覆盖重写父类Object方法
    @Override
    public String toString() {
        return "OuterClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OuterClass that = (OuterClass) o;
        return age == that.age &&
                Objects.equals(name, that.name) &&
                Objects.equals(arrayList, that.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, arrayList);
    }
}

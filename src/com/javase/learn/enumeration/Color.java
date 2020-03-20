package com.javase.learn.enumeration;

public enum Color {
    RED(1,"红色"),BLUE(2,"蓝色"),
    YELLOW(3,"黄色");

    //成员变量
    private int num;
    private  String name;

    //构造方法
    Color(int num, String name) {
        this.num = num;
        this.name = name;
    }

    //成员方法
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //覆盖重写父类方法
    @Override
    public String toString() {
        return "EnumDemo{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

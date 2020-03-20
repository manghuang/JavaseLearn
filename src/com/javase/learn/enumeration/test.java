package com.javase.learn.enumeration;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Color.values()));
        System.out.println(Color.RED);
        System.out.println(Color.RED.getName());
        Color color = Color.YELLOW;
        switch (color){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;
        }
    }
}

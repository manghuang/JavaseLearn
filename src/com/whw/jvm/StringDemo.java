package com.whw.jvm;


import org.junit.Test;

public class StringDemo {

    @Test
    public void test1(){
//        String s1 = "a";
//        String s2 = "a";
//        String s3 = new String("a");
//        String s4 = new String("a");
//        System.out.println(s1 == "a");
//        System.out.println(s2 == "a");
//        System.out.println(s3 == s2);
//        System.out.println(s4 == s3);
        String s1 = new String("abc");
        System.out.println(s1 == "abc");
        System.out.println("abc".equals(s1));

    }
}

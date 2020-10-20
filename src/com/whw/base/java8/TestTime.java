package com.whw.base.java8;

import org.junit.Test;

import java.time.LocalDateTime;

public class TestTime {

    @Test
    public void test1(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());

        LocalDateTime ldt2 = LocalDateTime.of(2015,10,10,13,22,12,1);
        System.out.println(ldt2);

        LocalDateTime ldt3 = ldt.plusYears(2);
        System.out.println(ldt3);

        LocalDateTime ldt4 = ldt.minusYears(2);
        System.out.println(ldt4);
    }
}

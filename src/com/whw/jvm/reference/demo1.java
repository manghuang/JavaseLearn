package com.whw.jvm.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) throws InterruptedException {
        SoftReference<String> stringSoftReference = new SoftReference<>("abc");
        WeakReference<String> stringWeakReference = new WeakReference<>("def");
//        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
//        System.out.println(stringSoftReference.get());
//        System.out.println(stringWeakReference.get());
        Thread.sleep(10000);
        System.gc();
        Thread.sleep(10000);
    }
}

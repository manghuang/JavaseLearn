package com.javase.learn.java8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/*
 * java8的新特性  新的时间日期API
 * 无多线程安全问题
 */
public class TimeDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE.ofPattern("yyyyMMdd");

        Callable<LocalDate> task = new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                return LocalDate.parse("20200224", dtf);
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<LocalDate>> results = new ArrayList<>();

        for(int i =0; i<10; i++){
            results.add(pool.submit(task));
        }

        for(Future<LocalDate> future : results){
            System.out.println(future.get());
        }
    }
}

package com.whw.base.java8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/*
 *java8以前日期的操作问题演示
 * 加锁解决
 */
public class TimeDemo2 {

    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>(){
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd");
        }
    };

    public static Date convert(String source) throws ParseException {
        return df.get().parse(source);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Date> task = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                return TimeDemo2.convert("20161218");
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<Date>> results = new ArrayList<>();

        for(int i =0; i<10; i++){
            results.add(pool.submit(task));
        }

        for(Future<Date> future : results){
            System.out.println(future.get());
        }

        pool.shutdown();
    }
}

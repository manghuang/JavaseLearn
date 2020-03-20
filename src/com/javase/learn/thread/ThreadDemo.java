package com.javase.learn.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            es.submit(new RunnableImpl());
        }
        es.shutdown();
    }
}

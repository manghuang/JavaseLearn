package com.whw.multithread.thread;

public class Demo2 {
    public static class RunnableImpl implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpl(), "thread1");
        Thread thread2 = new Thread(new RunnableImpl(), "thread2");
        thread1.start();
        thread2.start();
        System.out.println("Main");
    }
}

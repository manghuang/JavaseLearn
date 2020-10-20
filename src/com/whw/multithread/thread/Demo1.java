package com.whw.multithread.thread;

public class Demo1 {
    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        System.out.println("Main");
    }

}

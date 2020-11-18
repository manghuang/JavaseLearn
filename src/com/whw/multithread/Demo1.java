package com.whw.multithread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private int val = 1;
    public void test(){
        lock.lock();
        while (val < 0){
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread());
        condition.signalAll();
        lock.unlock();
    }

}

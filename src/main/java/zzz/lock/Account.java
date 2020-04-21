package zzz.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private double yue;
    private ReentrantLock reentrantLock= new ReentrantLock();
    public Account(double yue) {
        this.yue = yue;
    }

    public  void setMoney(double money) {
    try {
        reentrantLock.lock();
        if (money > 0) {
            yue += money;
            System.out.println(Thread.currentThread().getName() + "存钱成功剩下" + yue);
        }
        }finally {
        reentrantLock.unlock();
    }
    }
}

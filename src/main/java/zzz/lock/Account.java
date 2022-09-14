package zzz.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 方式解决线程安全问题
 */
public class Account {

    public double acc;

    private ReentrantLock lock = new ReentrantLock();

    public Account(double acc) {
        this.acc = acc;
    }

    public double setMoney(double money) {
        try {
            lock.lock();
            Thread.sleep(200);
            acc = acc + money;
            System.out.println(Thread.currentThread().getName() + "存款完成"+ acc);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return acc;
    }
}

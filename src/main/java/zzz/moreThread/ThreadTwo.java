package zzz.moreThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现Runnable 接口创建多线程   和Thread的区别  Thread也是实现了Runnable
 * <p>
 * 实现方式更方便处理共享数据问题
 */
public class ThreadTwo implements Runnable {
    private int ticket = 100;
    Object obj = new Object();
    ReentrantLock lock = new ReentrantLock();

    public void run() {

        while (true) {
//            synchronized (this) {
//                if (ticket > 0) {
//                    System.out.println(Thread.currentThread().getName() + "还有票" + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
//            }
            show2();
       }


    }
    public void show2(){
        try {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + ticket--);
            }
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        ThreadTwo threadTwo = new ThreadTwo();
        new Thread(threadTwo).start();
        new Thread(threadTwo).start();
        new Thread(threadTwo).start();
    }

    private synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "还有票" + ticket);
            ticket--;
        }
    }
}


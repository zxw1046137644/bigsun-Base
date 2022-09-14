package zzz.moreThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程通信
 * wait
 * notify
 * notifyAll
 * 必须 在同步方法 或同步代码中
 */
public class ThreadCommunication implements Runnable {
    private int ticket = 100;

    public void run() {

        while (true) {
            synchronized (this) {
                notifyAll();
                if (ticket > 0) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + ticket--);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else
                {
                    break;
                }
            }
        }


    }

    public void show2() throws InterruptedException {
        if (ticket > 0) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + ticket--);
        }
    }

    public static void main(String[] args) {
        ThreadCommunication threadTwo = new ThreadCommunication();
        new Thread(threadTwo).start();
        new Thread(threadTwo).start();
        new Thread(threadTwo).start();
    }

}

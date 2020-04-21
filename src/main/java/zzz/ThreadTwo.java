package zzz;

public class ThreadTwo implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    public void run() {
        while (true) {
            show();
        }

    }

    private synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() +  "还有票" + ticket);
            ticket--;
        }
    }
}


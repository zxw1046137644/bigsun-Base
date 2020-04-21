package zzz;

public class ThreadT extends Thread {
    public ThreadT() {

    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

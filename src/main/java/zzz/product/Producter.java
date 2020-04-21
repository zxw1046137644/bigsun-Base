package zzz.product;

public class Producter implements Runnable {

    DianEr dianEr;

    public Producter(DianEr dianEr) {
        this.dianEr = dianEr;
    }

    public void run() {
        while (true) {
            try {
                dianEr.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

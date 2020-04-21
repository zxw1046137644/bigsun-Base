package zzz.product;

public class Customer implements Runnable {

    DianEr dianEr;

    public Customer(DianEr dianEr) {
        this.dianEr = dianEr;
    }

    public void run() {
        while (true) {
            try {
                dianEr.custom();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

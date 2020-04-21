package zzz.product;

public class DianEr {
    private int sum = 0;

    public synchronized void produce() throws InterruptedException {//生产

        if (sum < 20) {

            sum++;
            System.out.println(Thread.currentThread().getName() + "开始生产了" + sum);
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void custom() throws InterruptedException {//消费

        if (sum > 0) {
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName() + "开始消费" + sum);
            sum--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

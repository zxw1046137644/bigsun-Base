package zzz.lock;


public class day0LockTest {

    public static void main(String[] args) {
        Account acc =new Account(0);
        Lock lock1 =new Lock(acc);
//        Lock lock2 =new Lock(acc);
//        lock1.setName("用户1");
//        lock2.setName("用户2");
//        lock1.start();
//        lock2.start();
        Thread thread1 = new Thread(lock1);
        Thread thread2 = new Thread(lock1);
        Thread thread3 = new Thread(lock1);
        Thread thread4 = new Thread(lock1);
        Thread thread5 = new Thread(lock1);
        Thread thread6 = new Thread(lock1);
        thread1.setName("用户1");
        thread2.setName("用户2");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }
}

package zzz.moreThread;


/**
 * 继承Thread 类实现多线程
 *
 * Thread常用方法
 *   currentThread() 获取当前线程对象
 *     getName()
 *     setName()
 *     yield()  释放cpu执行权
 *     join()  A线程中调用B线程的join方法，A线程跳出执行，B线程加入执行，直到B线程执行完毕
 *     isAlive() 判断线程是否存活
 *     getPriority() 获取线程优先级
 *
 *
 */
public class ThreadT extends Thread{

    static int ticket = 100;
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (ThreadT.class){
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(200);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + " " + ticket--);
//                }
//                else {
//                    break;
//                }
//            }
            show();
        }

    }

    public static synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + ticket--);
        }
    }

}
class window{
    public static void main(String[] args) {

        ThreadT threadT = new ThreadT();
        ThreadT threadT2 = new ThreadT();
        ThreadT threadT3 = new ThreadT();
        threadT.start();
        threadT2.start();
        threadT3.start();


    }
}


package zzz.moreThread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的使用
 * Executors
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //
        executorService.execute(new ThreadTwo());//适合Runnable
//        executorService.submit()  适合callable
        executorService.shutdown();

    }

}

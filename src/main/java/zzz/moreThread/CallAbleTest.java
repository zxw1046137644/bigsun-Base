package zzz.moreThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 实现callable 创建多线程
 * 通过FutureTask类获取返回结果
 */
public class CallAbleTest implements Callable<Integer> {
    @Override
    public Integer call(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
class Test{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallAbleTest callAbleTest = new CallAbleTest();
        FutureTask<Integer> futureTask = new FutureTask(callAbleTest);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }

}

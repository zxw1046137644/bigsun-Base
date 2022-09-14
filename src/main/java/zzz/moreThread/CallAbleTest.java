package zzz.moreThread;

import java.util.concurrent.Callable;

public class CallAbleTest implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("1");
        return null;
    }
}

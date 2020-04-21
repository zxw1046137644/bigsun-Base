import zzz.lock.Account;
import zzz.lock.Lock;

public class LockTest {

    public static void main(String[] args) {
        Account acc =new Account(0);
        Lock lock1 =new Lock(acc);
        Lock lock2 =new Lock(acc);
        lock1.setName("用户1");
        lock2.setName("用户2");
        lock1.start();
        lock2.start();
    }
}

package zzz.Lock;

public class Lock implements Runnable {

    public Account account;

    public Lock(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
            System.out.println(account.setMoney(1000));
    }
}

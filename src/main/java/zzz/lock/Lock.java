package zzz.lock;

public class Lock  extends Thread{
    private Account acc;

    public Lock(Account acc){
        this.acc=acc;
    }

    @Override
    public void run() {
        for (int i =0;i<3;i++){
       acc.setMoney(1000);
        }
     }
}

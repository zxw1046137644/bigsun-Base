import zzz.product.Customer;
import zzz.product.DianEr;
import zzz.product.Producter;

public class day0productTest {

    /**
     * product包，生产者消费者的简单实现
     */
    public static void main(String[] args) {
        DianEr dianEr =new DianEr();
        Customer customer = new Customer(dianEr);
        Producter producter =new Producter(dianEr);
        Thread t1= new Thread(customer);
        Thread t2= new Thread(producter);
        t1.setName("消费者");
        t2.setName("生产者");
        t1.start();
        t2.start();
    }
}

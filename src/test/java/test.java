import org.junit.Test;
import zzz.ThreadT;
import zzz.ThreadTwo;

public class test {
    @Test
    public void threadTwoTest() {
        ThreadTwo tw = new ThreadTwo();
        new Thread(tw).start();
    }

    public static void main(String[] args) {
        ThreadTwo tw = new ThreadTwo();
        Thread th1 = new Thread(tw);
        Thread th2 = new Thread(tw);
        Thread th3 = new Thread(tw);
        th1.setName("1111");
        th2.setName("222");
        th3.setName("3333");
        th1.start();
        th2.start();
        th3.start();
    }

    @Test
    public void test2() {
        double x = 12, y = 8, z;
        z = (0.9 + x / y);
        System.out.println(z);
    }
}

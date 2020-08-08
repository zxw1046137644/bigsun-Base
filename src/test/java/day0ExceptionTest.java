import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常
 */
//获取自定义异常
public class day0ExceptionTest {
    public static void main(String[] args) {
        bb b = new bb();
        try {
            b.biJia(1, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test//获取系统运行时异常
    public void getRunException() {
        try {
            int a = 1 / 0;
            System.out.println("异常已经出现了看我打印不打印");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + "异常信息");
            System.out.println(e.toString() + "输出异常串");
            System.out.println("打印异常信息");
            e.printStackTrace();
        } finally {
            System.out.println("finally 输出了");
        }
    }

    @Test//获取系统编译时异常,需要抛出异常或者进行异常捕获 try catch
    public void getBuildException() throws FileNotFoundException {
        File file = new File("/dd");
        FileInputStream inputStream =new FileInputStream(file);
    }
}
//抛出一个 自定义的异常，并由调用此方法的对象方法捕获后处理 throw
class bb {
    public void biJia(int a, int b) throws Oexcetion {
        if (a < b) {
            throw new Oexcetion("出现自定义异常了");
        }
    }
}

//创建一个自定义异常的类
class Oexcetion extends RuntimeException {

    final long serialVersionUID = -703407466939L;

    public Oexcetion() {
    }

    public Oexcetion(String msg) {
        super(msg);
    }
}
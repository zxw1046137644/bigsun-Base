import org.junit.Test;

import java.io.*;

public class day5FileTest {
    /**
     * InputSteam字节流
     *   --BufferedInputStream(InputSteam a)缓冲流,效率高 在读取过程中已-1结束
     *   >>>>常用方法
     *  int read() 开始读取数据
     *  int read(byte b,index,len) 读取从index开始的len个字节数 到 byte 数组b里
     * int available() 返回能读取的字节数
     *
     *
     * OutputStream
     *  --BufferedOutputStream(InputSteam a)缓冲流
     *   >>>>常用方法
     *   write()
     *   write(byte b,index,len)写入从index开始的len个字节数 到 byte 数组b里
     *   flush() 未读完情况下（-1）强制把流中的数据写入文件
     *  markSupported() 判断当前的流是否支持标记再读取操作
     *
     *
     * 字符流
     * Reader
     * Writer
     *
     * @throws FileNotFoundException
     *
     */
    @Test
    public void io() throws IOException {
        //获取文件内容
        InputStream inputStream = new FileInputStream(new File("D:\\\\server\\\\Java-Base\\\\111\\\\222\\\\333.txt\\"));
        //使用缓冲流获取
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);//字节缓冲流,用这个效率高


        //定义字节数据
        byte[] b = new byte[2500];

        //获取输入地址
        OutputStream outputStream = new FileOutputStream("444.txt");
        //使用缓冲流输出
        BufferedOutputStream out = new BufferedOutputStream(outputStream);

        int len = 0;
        //循环输出内容
//        while ((len = bufferedInputStream.read(b)) != -1) {
//            System.out.println(len);
//            out.write(b, 0, len);
//        }
        bufferedInputStream.read(b,0,b.length);
        out.write(b);
        out.flush();
        System.out.println(bufferedInputStream.available());
        bufferedInputStream.mark(bufferedInputStream.available());
        bufferedInputStream.reset();
    }
}

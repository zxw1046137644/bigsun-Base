package String;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

/**
 * final 不可变字符串 可序列化 可比较
 */
public class test {

    private String name;

    @Test
    public void test(){
        name = "zxw";
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("zxw");
//        System.out.println(stringBuffer);
        char[] chars = name.toCharArray();
        System.out.println(chars);
        Arrays.sort(chars);
        System.out.println(chars);


        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append("stringBuilder");

        String s1 = " hello ";
        //判断字符串是否相等 负数当前对象小，正数当前对象大
        System.out.println(s1.compareTo("2"));
        //转化字符串
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        //连接字符串
        System.out.println(s1.concat("world"));
        //去除首位空格
        System.out.println(s1.trim());
        //查看字符是否以xx结尾
        System.out.println(s1.endsWith("o"));
        //查看字符是否以xx开头
        System.out.println(s1.startsWith("h"));
        //查看字符串中是否包含字符串
        System.out.println(s1.contains("ll"));

    }
}

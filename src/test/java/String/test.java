package String;

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
        stringBuffer.append("stringBuilder");

//        System.out.println(stringBuilder);
    }
}

package String;

import org.junit.Test;

public class test {

    private String name;

    @Test
    public void test(){
        name = "zxw";
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("zxw");
        System.out.println(stringBuffer);



        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuffer.append("stringBuilder");

        System.out.println(stringBuilder);
    }
}

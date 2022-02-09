package zzz.exception;

import java.util.Arrays;
import java.util.List;

public class exceptTest {


    public static void main(String[] args) {
        two t = new two();
        try {
            System.out.println("start");
            System.out.println(String.format("a:%s","b222"));
            Boolean B = t.sta();
            System.out.println(B);
            List<Integer> waitStatus = Arrays.asList(0, 1, 2, 3);
            System.out.println(waitStatus.contains(2));
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
class two{
    public Boolean sta() throws CustomException {
        CustomException.exceptionCreate("有异常");
//        int a = 1/0;
        return false;
    }
}

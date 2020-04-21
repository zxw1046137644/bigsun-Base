import zzz.Oexcetion;
import zzz.bb;

import javax.management.AttributeList;
import java.util.*;

/**
 * 异常
 */
public class day0ExceptionTest {
    public static void main(String[] args) {
        bb b = new bb();
        try {
            b.biJia(31, 2);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        int[] sum = new int[20];
        int s = sum.length;
        sum[1] = 1;
        sum[3] = 1;
        sum[2] = 2;
        sum[4] = 2;
        List list = new ArrayList();
        Set set = new HashSet();
        Map map =new HashMap();
        for (int i =0;i<sum.length;i++)
        {
            list.add(sum[i]);
        }
        list.add("finally");
        ArrayList arrlist = new ArrayList(Arrays.asList(sum));
        arrlist.add(1);
        System.out.println(arrlist);
        System.out.println(list);
    }

}

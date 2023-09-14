package Collection;


import org.junit.Test;
import zzz.Collection.Emplay;

import java.util.*;

/**
 * Collections 操作 map和list和set的工具类
 */
public class CollectionsTest {

    String string = "zxw";
    @Test
   public void test(){
       char[] chars = string.toCharArray();
       int[] nums = new int[]{3,21,2};
       Integer[] nums1 = new Integer[]{3,1,2};
        Emplay emplay= new Emplay();
        emplay.setAge(1);
        emplay.setName("zzz");
        Emplay emplay1= new Emplay();
        emplay1.setAge(1);
        emplay1.setName("zzz");
        Emplay[] emplays =new Emplay[]{emplay,emplay1};

        System.out.println(Arrays.toString(chars));
       List<Integer> chars1 = Arrays.asList(nums1);
       Collections.reverse(chars1);
        Collections.sort(chars1,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(chars1);
   }


   public void safeList(){
        List list = new ArrayList();
        list.add(1);
       List list1 = Collections.synchronizedList(list);
   }


}

package Array;

import org.apache.poi.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class arrayTest {

    Integer[] intValue = new Integer[]{1,234,4,3,5,5};




    @Test
    public void Test(){
        System.out.println(intValue);


        Arrays.sort(intValue, new Comparator<Integer>() {
            @Override
            public int compare(Integer o, Integer t1) {
                return -o.compareTo(t1);
            }
        });


        System.out.println(Arrays.toString(intValue));
//        for (int i =intValue.length-1;i>=0;i--){
//            System.out.println(intValue[i]);
//        }

    }




}

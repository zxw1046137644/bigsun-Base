package Array;

import org.apache.poi.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;

public class arrayTest {

    int[] intValue = new int[]{1,234,4,3,5,5};
    @Test
    public void Test(){
        System.out.println(intValue);
        Arrays.sort(intValue);
        for (int i =intValue.length-1;i>=0;i--){
            System.out.println(intValue[i]);
        }

    }




}

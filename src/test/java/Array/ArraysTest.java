package Array;


import org.junit.Test;

import java.util.Arrays;

/**
 * arrays 工具类的使用
 */
public class ArraysTest {
    int[] nums = new int[100];
    int[] value = new int[100];

    @Test
    public void Test() {
        System.out.println(Arrays.copyOf(nums,nums.length *2).length);
    }
}

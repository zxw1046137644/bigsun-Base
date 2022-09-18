package sort;

import org.junit.Test;

/**
 * 冒泡排序
 */
public class BubblingSort {


    @Test
    public void bubblingSort() {
        int[] nums = new int[]{2, 1, 3, 88, 44, 99};
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }


}

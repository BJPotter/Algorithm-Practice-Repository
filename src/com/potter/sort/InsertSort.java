package com.potter.sort;

/**
 * Author: Zhi Liu
 * Date: 2024/4/11 13:30
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class InsertSort {
    public static void sort(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int curr = nums[i];
            int j = length;
            while (j > 0 && nums[i] > curr ){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = curr;
        }
    }
}

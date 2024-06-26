package com.potter.sort;

/**
 * Author: Zhi Liu
 * Date: 2024/4/11 13:09
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class BubbleSort {
    public static void sort(int[] nums){
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(nums[i] > nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
}

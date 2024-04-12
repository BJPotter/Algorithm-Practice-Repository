package com.potter.sort;

/**
 * Author: Zhi Liu
 * Date: 2024/4/11 12:48
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class SelectSort {
    public static void sort(int[] nums){
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,8,3,7,4,0};
        SelectSort.sort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

}

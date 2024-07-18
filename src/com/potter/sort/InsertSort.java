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
            //未排序列中要插的元素（从前往后开始遍历）
            int curr = nums[i];
            //找到已排序的序列[0,i-1]
            int j = i - 1;
            //当未排序列的元素小于已排序列的元素,已排序列后移动
            while (j >= 0 && nums[j] > curr ){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = curr;
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,8,3,7,4,0};
        InsertSort.sort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}

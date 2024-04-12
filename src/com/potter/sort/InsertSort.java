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
            //未排序列的元素进行遍历[i,length)
            int curr = nums[i];
            //已经排序好的元素[0,i-1]
            int j = i - 1;
            //如果当前元素小于已经排序的最后元素,将大的元素后移
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

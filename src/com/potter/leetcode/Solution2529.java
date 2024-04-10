package com.potter.leetcode;

/**
 * Author: Zhi Liu
 * Date: 2024/4/9 13:08
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class Solution2529 {
    public int maximumCount(int[] nums) {
       int pos1 = indexByTarget(nums,0);
       int pos2 = indexByTarget(nums,1);
       return Math.max(pos1,pos2);
    }

    public int indexByTarget(int[] nums,int target){
        int l = 0;
        int r = nums.length;
        while (l < r){
            int m = l + ( l + r )/2;
            if(nums[m] < target){
                l = m + 1;
            }
            else{
                r = m;
            }
        }
        return l;
    }
}

package com.potter.sort;

/**
 * Author: Zhi Liu
 * Date: 2024/4/12 13:30
 * Contact: liuzhi0531@gmail.com
 * Desc: 根据一个基准值,进行一趟排序后将数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 */
public class QuickSort {
    public void sort(int arr[],int l,int r){
        if(l >= r )
            return;
        //获取基准值的索引
        int pivotIndex = partition(arr, l, r);
        sort(arr,l,pivotIndex - 1);
        sort(arr,pivotIndex + 1,r);

    }

    public int partition(int arr[],int left,int right){
        int pivot = arr[left];
        int left_point = left;
        int right_point = right;
        while (left_point < right_point){
            while (left_point < right_point && arr[right_point] >= pivot){
                right_point--;
            }
            while (left_point < right_point && arr[left_point] <= pivot){
                left_point++;
            }
            if (left_point < right_point) {
                swap(arr, left_point, right_point);
            }
        }
        swap(arr,left_point,left);
        return left_point;
    }

    public void swap(int arr[],int l,int r){
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

    public static void main(String[] args) {
        int nums[] = {5,8,3,7,4,0};
        QuickSort quickSort = new QuickSort();
        int r  = nums.length;
        quickSort.sort(nums,0,r-1);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}

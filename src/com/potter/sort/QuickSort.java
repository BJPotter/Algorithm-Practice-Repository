package com.potter.sort;

import java.util.Collection;
import java.util.Collections;

/**
 * Author: Zhi Liu
 * Date: 2024/4/12 14:22
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class QuickSort {
    public void quickSort(int[] arr, int left, int right){
        if(left >= right)
            return;
        int partitionIndex = partition(arr, left, right);
        quickSort(arr,left,partitionIndex - 1);
        quickSort(arr,partitionIndex+1,right);
    }

    public int partition(int[] arr, int left, int right){
        int pivot = left;
        int index = left + 1;

        for (int i = index;i <= right;i++){

        }
        return 0;
    }

}

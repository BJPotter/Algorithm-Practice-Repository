package com.potter.sort;

/**
 * Author: Zhi Liu
 * Date: 2024/4/11 13:09
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class BubbleSort {
    public static void sort(int arr[]){
        for(int i=0;i < arr.length - 1;i++){
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,3,7,4,0};
        BubbleSort.sort(arr);
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}

package com.potter.sort;

/**
 * Author: Zhi Liu
 * Date: 2024/4/12 14:22
 * Contact: liuzhi0531@gmail.com
 * Desc: 快速排序算法
 */
public class QuickSort {
   public static void quickSort(int arr[],int low,int high){
       if( low < high ){
           int pivotPos = part(arr, low, high);
           quickSort(arr,low,pivotPos - 1);
           quickSort(arr,pivotPos + 1,high);
       }
   }

   public static int part(int arr[],int low,int high){
       int pivot = arr[low];
       while ( low < high ){
           while (low < high && arr[high] >= pivot) {
               high--;
           }
           arr[low] = arr[high];
           while (low < high && arr[low] <= pivot){
               low++;
           }
           arr[high] = arr[low];
       }
       arr[low] = pivot;
       return low;
   }

    public static void main(String[] args) {
        int arr[] = {3,2,6,5,10,99,1};
        quickSort(arr,0,arr.length - 1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}

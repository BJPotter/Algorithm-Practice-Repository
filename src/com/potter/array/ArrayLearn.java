package com.potter.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Zhi Liu
 * Date: 2024/7/18 15:16
 * Contact: liuzhi0531@gmail.com
 * Desc:
 */
public class ArrayLearn {

    public int[] initArray(){
        return new int[]{1,2,3,4,5};
    }
    //查找
    public int getElement(int[] arr,int i){
        if(i>=0 && i< arr.length){
            return arr[i];
        }
        throw new RuntimeException("array index exception");
    }
    //删除
    public int[] removeElement(int[] arr, int element){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != element){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    //插入
    public int[] addElement(int[] arr, int element){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
        }
        list.add(element);
        return list.stream().mapToInt(i -> i).toArray();
    }

    //更新
    public int[] updateElement(int[] arr, int index,int element){
        if(index >= 0 && index < arr.length){
            arr[index] = element;
            return arr;
        }
        throw new RuntimeException("array index exception");
    }

    //遍历
    public void iteratorElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //数组扩容
    public int[] resize(int[] arr,int size){
        int newSize = arr.length + size;
        int[] newArr = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }


}

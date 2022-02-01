package com.company.leetcode;

import java.lang.reflect.Array;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        nextPermutation(arr);
    }
    public static void nextPermutation(int arr[]){
        int i = arr.length-2;
        while (i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        int j = arr.length-1;
        if(i>=0){
            while (j>=0 && arr[j]<arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1);
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[], int start){
        int end = arr.length-1;
        while (start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}

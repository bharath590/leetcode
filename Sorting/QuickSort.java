package com.company.leetcode.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = {5,3,3,1,2};
        quickSort(nums,0,nums.length-1);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void quickSort(int nums[],int l, int r){
        if(l>r){
            return;
        }
        int pivot = partition(nums,l,r);
        quickSort(nums,l,pivot-1);
        quickSort(nums,pivot+1,r);
    }
    public static int partition(int nums[],int l, int r){
        int pi = nums[r];
        int i = l-1;
        int j=l;
        while (j<r){
            if(nums[j]<pi){
                i++;
                swap(nums,i,j);
            }
            j++;
        }
        swap(nums,i+1,j);
        return i+1;
    }
    public static void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

package com.company.leetcode.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int nums[] = {5,3,3,1,2};
        mergeSort(nums,0,nums.length-1);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void mergeSort(int nums[],int l,int r){
        if(l>=r){
            return;
        }
        int m = (l+r)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,r,m);
    }
    public static void merge(int nums[], int l, int r,int m){
        int l1 = m-l+1;
        int l2 = r-m;
        int L1[] = new int[l1];
        int L2[] = new int[l2];
        for (int i=0;i<l1;i++){
            L1[i] = nums[l+i];
        }
        for (int j=0;j<l2;j++){
            L2[j]=nums[m+1+j];
        }
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < l1 && j < l2) {
            if (L1[i] <= L2[j]) {
                nums[k] = L1[i];
                i++;
            }
            else {
                nums[k] = L2[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < l1) {
            nums[k] = L1[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < l2) {
            nums[k] = L2[j];
            j++;
            k++;
        }
    }
}

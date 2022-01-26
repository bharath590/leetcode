package com.company.leetcode;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,4,7,9};
        int [] arr2 = {1,2,3,5,8,10};
        int [] sorted = new int[arr1.length+arr2.length];
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i =0;
        int j =0;
        int k =0;
        while(j<len2 && i<len1){
                if(arr1[i]<arr2[j]){
                    sorted[k] = arr1[i];
                    i++;
                } else{
                    sorted[k] = arr2[j];
                    j++;
                }
                k++;
            }
        while(i<len1){
            sorted[k] = arr1[i];
            i++;
            k++;
        }
        while (j<len2){
            sorted[k] = arr2[j];
            j++;
            k++;
        }
        for(int m=0;m<sorted.length;m++){
            System.out.println(sorted[m]);
        }
    }
}

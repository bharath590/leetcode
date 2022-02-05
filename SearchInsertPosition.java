package com.company.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums [] = {1,3,5,6};
       int res =  search(nums,0,nums.length-1,2);
       System.out.println(res);
    }
    public static  int search(int nums[],int l, int r, int target){
        if(l>r) {
            return l;
        }
        int m = (l+r)/2;
        if(nums[m]==target) return m;
        if(nums[m]>target){
            return search(nums,l,m-1,target);
        }else{
            return search(nums,m+1,r,target);
        }
    }
}

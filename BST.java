package com.company.leetcode;

public class BST {

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int start = -1;
        int end = -1;
        int res[] = new int[2];
        res[0] = -1;
        res[1] =-1;
        res[0] = searchEnd(nums,0,nums.length-1,target,end);
        res[1] = searchStart(nums,0,nums.length-1,target,start);
    }
    public static int searchEnd(int nums[],int l,int r,int target,int end){
        if(l>r){
            System.out.println(end);
            return end;
        }
        int m = (l+r)/2;
        if(nums[m]==target){
             end = m;
            return searchEnd(nums,m+1,r,target,end);
        }
        if(target<nums[m]){
            return searchEnd(nums,l,m-1,target,end);
        } else {
            return searchEnd(nums,m+1,r,target,end);
        }
    }
    public static int searchStart(int nums[],int l,int r,int target,int start){
        if(l>r){
            System.out.println(start);
            return start;
        }
        int m = (l+r)/2;
        if(nums[m]==target){
            start = m;
            return searchStart(nums,l,m-1,target,start);
        }
        if(target<=nums[m]){
            return searchStart(nums,l,m-1,target,start);
        } else {
            return searchStart(nums,m+1,r,target,start);
        }
    }
}

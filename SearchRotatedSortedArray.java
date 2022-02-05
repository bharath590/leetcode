package com.company.leetcode;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {1};
        search(nums,0,nums.length-1,2);
    }
    public static int search(int nums[],int start, int end,int target){
         if(start>end){
             System.out.println("not found");
             return -1;
         }
        int m  = (start+end)/2;

         if(nums[m]==target){
             System.out.println(m);
             return m;
         }
         if(nums[m]<nums[start]){
             //right sorted
             if(target<=nums[end] && target>=nums[m]){
                 return search(nums,m+1,end,target);
             } else {
                 return search(nums,start,m-1,target);
             }
         } else{
             //left sorted
             System.out.println(start+" "+end+" "+m);
             if(target>=nums[start] && target<=nums[m]){
                 return search(nums,start,m-1,target);
             } else{
                 return search(nums,m+1,end,target);
             }
         }
    }
}

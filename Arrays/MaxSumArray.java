package com.company.leetcode.Arrays;
/*Max sub array with indexes start and end
* */
public class MaxSumArray {
    public static void main(String[] args) {
        int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum =  maxSumSubArray(nums);
        System.out.println(maxSum);
    }
    public static int maxSumSubArray(int nums[]){
        int gSum = Integer.MIN_VALUE;
        int lSum = 0;
        int start = 0;
        int end = nums.length-1;
        int startg = start;
//        if(nums.length==1){
//            return nums[0];
//        }
        for (int i=0;i<nums.length;i++){
            lSum +=nums[i];
            if(lSum>gSum) {
                gSum = lSum;
                end = i;
                startg = start;
            }
            if(lSum<=0){
                start = i+1;
                lSum = 0;
            }
        }
        System.out.println(startg+" "+end);
        return gSum;
    }
}

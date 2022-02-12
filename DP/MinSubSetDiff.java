package com.company.leetcode.DP;

import java.util.ArrayList;

public class MinSubSetDiff {
    public static void main(String[] args) {
        int nums[] = {1,2,3,7};
        minSubSetDiff(nums);
    }
    public static int minSubSetDiff(int nums[]){

        int N = nums.length;
        int sum = 0;
        for (int i=0;i< nums.length;i++){
            sum +=nums[i];
        }
        int min = sum;
        boolean[][] dp = subSetSumDp(nums,sum,N);
        ArrayList<Integer> list = new ArrayList<>();
        for (int j=0;j<=dp[N].length/2;j++){
            if(dp[N][j]) list.add(j);
        }
        for (int data : list){
            if(min > Math.abs(sum-2*data)){
                 min = Math.abs(sum-2*data);
            }
        }
        return min;
    }
    public static boolean[][] subSetSumDp(int nums[],int sum,int l){
        boolean dp[][] = new boolean[l+1][sum+1];
        for (int i=0;i<l+1;i++){
            for (int j=0;j<sum+1;j++){
                if(i==0){
                    dp[i][j] = false;
                }
                if(j==0){
                    dp[i][j] = true;
                }
            }
        }
        for (int i=1;i<l+1;i++){
            for (int j=1; j<sum+1; j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp;
    }
}

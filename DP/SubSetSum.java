package com.company.leetcode.DP;

public class SubSetSum {
    public static void main(String[] args) {
        int nums[] = {2,3,7,8,10};
        int sum = 11;
        boolean status = subSetSum(nums,sum,nums.length);
        System.out.println(status);
    }
    public static boolean subSetSum(int nums[],int sum,int l){
        if (sum == 0){
            return true;
        }
        if(l==0){
            return  false;
        }
        if(nums[l-1]<=sum){
            return subSetSum(nums,sum-nums[l-1],l-1) || subSetSum(nums,sum,l-1);
        } else{
            return subSetSum(nums,sum,l-1);
        }
    }

    public static boolean subSetSumDpMem(int nums[],int sum,int l, boolean[][] dp){
        if (sum == 0){
            return true;
        }
        if(l==0){
            return  false;
        }
        if(dp[l][sum] ==false || dp[l][sum]==true ){
            return  dp[l][sum];
        }

        if(nums[l-1]<=sum){
            return dp[l][sum] = subSetSumDpMem(nums,sum-nums[l-1],l-1,dp) || subSetSumDpMem(nums,sum,l-1,dp);
        } else{
            return dp[l][sum] = subSetSumDpMem(nums,sum,l-1,dp);
        }
    }
    public static boolean subSetSumDp(int nums[],int sum,int l){
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
        return dp[l][sum];
    }
}


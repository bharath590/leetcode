package com.company.leetcode.DP;

public class Knapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};

        int w = 50;
        int n = wt.length;
        // Declare the table dynamically
        int dp[][] = new int[n + 1][w + 1];
        // Loop to initially filled the
        // table with -1
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < w + 1; j++){
                dp[i][j] = -1;
            }
        }
        int profit = knap(val,wt,w,n,dp);
        System.out.println(profit);

        knapDp(val,wt,w,n);

    }
    public static int knap(int val[],int wt[],int w,int n,int dp[][]){
        if(w==0 || n ==0) {
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){
            return  dp[n][w]  = Math.max(val[n-1]+knap(val,wt,w-wt[n-1],n-1,dp),knap(val,wt,w,n-1,dp));
        } else {
            return dp[n][w] = knap(val,wt,w,n-1,dp);
        }
    }
    public static void knapDp(int val[],int wt[],int W,int N){
        int dp[][] = new int[N + 1][W + 1];
        // Loop to initially filled the
        // table with -1
        for(int n = 0; n < N + 1; n++) {
            for(int w = 0; w < W + 1; w++){
                if(n==0 || w==0)
                    dp[n][w] = 0;
            }
        }
        for(int n = 1; n < N + 1; n++) {
            for(int w = 1; w < W + 1; w++){
                if(wt[n-1]<=w){
                    dp[n][w] = Math.max(val[n-1]+dp[n-1][w-wt[n-1]],dp[n-1][w]);
                } else {
                    dp[n][w] = dp[n-1][w];
                }
            }
        }
        System.out.println(dp[N][W]);
    }
}

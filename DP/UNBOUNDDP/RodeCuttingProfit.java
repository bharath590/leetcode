package com.company.leetcode.DP.UNBOUNDDP;

public class RodeCuttingProfit {
    public static void main(String[] args) {
        int prices[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int lengths[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int L = 8;
        int profit = rodeCuttingProfit(prices,lengths,L);
        System.out.println(profit);
    }
    public static int rodeCuttingProfit(int prices[],int[] lengths,int L){
        int N = lengths.length;
        int dp[][] = new int[N+1][L+1];
        for (int i=0;i<N+1;i++){
            for (int j=0;j<L+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for (int i=1;i<N+1;i++){
            for (int j=1;j<L+1;j++){
                if(lengths[i-1]<=j){
                    dp[i][j] = Math.max(prices[i-1]+dp[i][j-lengths[i-1]],dp[i-1][j]);
                } else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        for (int i=1;i<N+1;i++){
            for (int j=1;j<L+1;j++){
                System.out.print(" "+dp[i][j]+" ");
            }
            System.out.println(" ");
        }

        return dp[N][L];
    }

}

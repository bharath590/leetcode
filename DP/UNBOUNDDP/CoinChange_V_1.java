package com.company.leetcode.DP.UNBOUNDDP;

public class CoinChange_V_1 {
    public static void main(String[] args) {
        int coin[]={1,2,3};
        int sum = 5;
        int totalWays = coinChain(coin,sum);
        System.out.println(totalWays);
    }
    public static int coinChain(int coin[],int L){
        int N = coin.length;
        int dp[][] = new int[N+1][L+1];
        for (int i=0;i<N+1;i++){
            for (int j=0;j<L+1;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        for (int i=1;i<N+1;i++){
            for (int j=1;j<L+1;j++){
                if(coin[i-1]<=j){
                    dp[i][j] = dp[i][j-coin[i-1]]+dp[i-1][j];
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

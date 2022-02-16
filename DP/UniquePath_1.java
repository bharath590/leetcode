package com.company.leetcode.DP;

public class UniquePath_1 {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int dp[][] = new int[m+1][n+1];
        for (int i=0;i<m+1;i++){
            for (int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
//        int ways = uniquePathMem(m-1,n-1,dp);
//        System.out.println(ways);

        int ways2 = uniquePathDp(m,n);
        System.out.println(ways2);
    }
    public static int uniquePathMem(int m, int n,int dp[][]){
        /**
         * this is my version
         */
        if(m<0 || n<0) {
            return 0;
        }
        if(m==0 && n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n] = uniquePathMem(m-1,n,dp)+uniquePathMem(m,n-1,dp);
    }

    public static int uniquePathDp(int m, int n){
        int dp[][] = new int[m+1][n+1];
        for (int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for (int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

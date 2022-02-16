package com.company.leetcode.DP.PatternMatching;

import java.util.Arrays;

public class LongestCommonSequence {
    public static void main(String[] args) {
        String x = "abcdfh";
        String y = "abedfhh";
        int len = LCS(x,y,x.length(),y.length(),"");
        System.out.println(len+" recursion");
         int M = x.length();
         int N = y.length();
         int dp[][] = new int[M+1][N+1];
         int maxLen =  LCSMem(x,y,M,N,dp);
         System.out.println(maxLen + " recursion with memorization");

         int maxLen2 = LCSDp(x,y,M,N);
         System.out.println(maxLen2+" Dp");
    }
    public static int LCS(String x, String y, int i, int j, String s){
        if(i==0 || j==0){
            return 0;
        }
        boolean b = x.charAt(i-1) == y.charAt(j-1);
        if(b){
            return 1+LCS(x,y,i-1,j-1,s);
        }
        return Math.max(LCS(x,y,i,j-1,s),LCS(x,y,i-1,j,s));
    }
    public static int LCSMem(String x, String y, int i, int j,  int dp[][]){
        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        boolean b = x.charAt(i-1) == y.charAt(j-1);
        if(b){
            return dp[i][j] = 1+LCSMem(x,y,i-1,j-1,dp);
        }
        return dp[i][j] = Math.max(LCSMem(x,y,i,j-1,dp),LCSMem(x,y,i-1,j,dp));
    }

    public static int LCSDp(String x, String y, int M, int N){
        int dp[][] = new int[M+1][N+1];
        for (int[] row: dp)
            Arrays.fill(row, 0);
        for (int i=1;i<M+1;i++){
            for (int j=1;j<N+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[M][N];
    }

}

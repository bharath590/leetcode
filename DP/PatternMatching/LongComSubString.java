package com.company.leetcode.DP.PatternMatching;

import java.util.Arrays;

public class LongComSubString {
    public static void main(String[] args) {
        String x = "abcdfh";
        String y = "abedfhh";
        int len = longComSubString(x,y,x.length(),y.length(),0);
    }
    public static int longComSubString(String x, String y, int M, int N,int count){
        if(M==0 || N==0){
            return 0;
        }
        int same = count;
        if(x.charAt(M-1) == y.charAt(N-1)){
            same =  longComSubString(x,y,M-1,N-1,count+1);
        }
        int diff1 = longComSubString(x,y,M-1,N,0);
        int diff2 = longComSubString(x,y,M,N-1,0);
        int res = Math.max(same,Math.max(diff1,diff2));
        return res;
    }
    public static int LCStringDp(String x, String y, int M, int N){
        int dp[][] = new int[M+1][N+1];
        for (int[] row: dp)
            Arrays.fill(row, 0);
        for (int i=1;i<M+1;i++){
            for (int j=1;j<N+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[M][N];
    }
}

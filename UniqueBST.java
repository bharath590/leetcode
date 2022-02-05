package com.company.leetcode;

public class UniqueBST {
    public static void main(String[] args) {
        int n = 1;
        int a =numTrees(n);
        System.out.println(a);
    }
    public static int numTrees(int n) {
        int num[] = new int[n+1];
        if(n==1 || n==0){
            return 1;
        }
        if(n==2){
            return 2;
        }
        num[0] = 1;
        num[1] = 1;
        num[2] = 2;
        for (int i=3;i<=n;i++){
            for (int j=1;j<=i;j++){
                num[i] =  num[i] + (num[j-1]*num[i-j]);
            }
        }
        return num[n];
    }
}

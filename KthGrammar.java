package com.company.leetcode;

public class KthGrammar {
    public static void main(String[] args) {
        int data = grammar(3,3);
        System.out.println(data);
    }
    public static int grammar(int n, int k){
        if(n==1&&k==1){
            return 0;
        }
        int m = ((int) Math.pow(2,n-1)/2)+1;
        System.out.println(n+" "+k+" "+m);
        if(k<=m){
            return grammar(n-1,k);
        }else{
            return grammar(n,k-m) == 0 ? 1 : 0;
        }
    }
}

package com.company.leetcode;

public class PermutationsOfString {
    public static void main(String[] args) {
        permutation("abc",0);
    }
    public static void permutation(String str,int l){
        if(l==str.length()){
            System.out.println(str);
            return;
        }
        for(int i=l;i<str.length();i++){
            str = swap(str,i,l);
            permutation(str,l+1);
            swap(str,l,i);

        }
    }
    public static String swap(String str,int i, int l){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[l];
        ch[l] = temp;
        str = String.valueOf(ch);
        return str;
    }
}

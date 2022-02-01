package com.company.leetcode;

public class CaseChangePermute {
    public static void main(String[] args) {
//        permute("abc","",0);
        permuteV2("a1b2","",0);
    }
    public static void permute(String str, String out, int c){
        if(c==str.length()){
            System.out.println(out);return;
        }
        permute(str,out+Character.toUpperCase(str.charAt(c)),c+1);
        permute(str,out+str.charAt(c),c+1);
    }

    public static  void permuteV2(String str, String out, int c){
        if(c==str.length()){
            System.out.println(out);return;
        }
        if(Character.isDigit(str.charAt(c))){
            permuteV2(str,out+str.charAt(c),c+1);
        }else {
            permuteV2(str,out+Character.toUpperCase(str.charAt(c)),c+1);
            permuteV2(str,out+str.charAt(c),c+1);
        }
    }
}

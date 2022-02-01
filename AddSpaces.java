package com.company.leetcode;

public class AddSpaces {
    public static void main(String[] args) {
        String str = "abc";
        func(str,1,"a");
    }
    public static void func(String str,int c,String s){
        if(c==str.length()){
            System.out.println(s+" length "+s.length());
            return;
        }
        func(str,c+1,s+" "+str.charAt(c));
        func(str,c+1,s+str.charAt(c));
    }
}

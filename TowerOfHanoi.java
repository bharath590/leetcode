package com.company.leetcode;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        char s = 'A';
        char h = 'B';
        char d = 'C';
        tow(s,d,h,n);
    }
    public static void tow(char s,char d, char h, int n){
        if(n==0){
//            System.out.println("move plate:" +n +" from source:"+s +" to destination: "+d);
            return;
        }
//        System.out.println("move plate:" +n +" from source:"+s +" to destination: "+d);
        tow(s,h,d,n-1);
        System.out.println("Move disk "+ n + " from rod " +
                s +" to rod " + d );
        tow(h,d,s,n-1);
    }
}

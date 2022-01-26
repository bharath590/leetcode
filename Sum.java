package com.company.leetcode;

public class Sum {
    public static void main(String[] args) {
        int a= 4;
        int b = 2;
        int c = 5;
        int one = 0;
        int two = 0;
        int three = 0;
        if(a<b && a<c){
            one  = a;
            if(b<c){
                two = b;
                three = c;
            } else{
                two = c;
                three =b;
            }
        } else if (b<a&&b<c) {
            one = b;
            if(a<c){
                two =a;
                three =c;
            } else{
                two = c;
                three =a;
            }
        } else {
            one = c;
            if(a<b){
                two = a;
                three =b;
            } else{
                two =b;
                three =a;
            }
        }
       System.out.println(one + " "+ two+" "+ three);
    }
}

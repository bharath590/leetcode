package com.company.leetcode;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Character,Integer> numberMap = new HashMap<>();
        numberMap.put('I',1);
        numberMap.put('V',5);
        numberMap.put('X',10);
        numberMap.put('L',50);
        numberMap.put('C',100);
        numberMap.put('D',500);
        numberMap.put('M',1000);
        String str = "MCMXCIV";
        //5 4 104 94 1094 994 1994
        System.out.println(numberMap);

        int len = str.length();
        int num = 0;
        char prev = str.charAt(len-1);
        while (len>0){
            try {
                int ele = numberMap.get(str.charAt(len-1));
                if(numberMap.get(prev)>ele){
                    num = num-ele;
                }else{
                    num = num+ele;
                }
                prev = str.charAt(len-1);
                System.out.println(num+" this is the number ");
            }catch (Exception e){
                System.out.println("Expetion :::"+e);
            }
            len--;
        }
    }
}

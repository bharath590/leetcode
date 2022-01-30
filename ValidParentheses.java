package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        //3
        int count = 3;
        int l = count;
        int r = 3;
        List<String> list = new ArrayList<>();
        validParentheses("",l,r,list);
        System.out.println(list);
    }
    public static void validParentheses(String str,int l, int r,List<String> list){
        if(l==0&&r==0){
            list.add(str);
            return;
        }
        if(l!=0){
            validParentheses(str+"(",l-1,r,list);
        }
        if(r>l){
            validParentheses(str+")",l,r-1,list);
        }
    }
}

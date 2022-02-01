package com.company.leetcode;

import java.util.Stack;

public class DeleteMiddleStack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        deleteMiddle(stack,3);
        System.out.println(stack);
    }
    public static void deleteMiddle(Stack<Integer> list,int m){
        if(m==1){
            list.pop();
            return;
        }
        int data = list.pop();
        deleteMiddle(list,m-1);
        list.push(data);
    }
}


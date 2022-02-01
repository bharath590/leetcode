package com.company.leetcode;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverse(stack);
        System.out.println(stack);
    }
    public static void reverse(Stack<Integer> list){
      if(list.size()==0){
          return;
      }
      int data = list.pop();
      reverse(list);
      insert(list,data);
    }
    public static void insert(Stack<Integer> list,int temp){
       if(list.size()==0){
           list.push(temp);
           return;
       }
        int data = list.pop();
        insert(list,temp);
        list.push(data);
    }
}

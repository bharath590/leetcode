package com.company.leetcode;

import java.util.*;
import java.util.Stack;

public class Recursion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        sortArray(list);
        System.out.println(list);
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        sortStack(stack);
        System.out.println(list);
    }
    public static  void sortArray(List<Integer> list){
        if(list.size()==1) return;
        int data = list.remove(list.size()-1);
        sortArray(list);
        insert(list,data);
    }
    public static void insert(List<Integer> list,int temp){
        if(list.size()==0 || list.get(list.size()-1)<=temp) {
            list.add(temp);
            return;
        }
        int data = list.remove(list.size()-1);
        insert(list,temp);
        list.add(data);
    }
/*
sort the stack using recursion
 */
    public static  void sortStack(Stack<Integer> list){
        if(list.size()==1) return;
        int data = list.pop();
        sortStack(list);
        insertStack(list,data);
    }
    public static void insertStack(Stack<Integer> list, int temp){
        if(list.size()==0 || list.peek()<=temp) {
            list.push(temp);
            return;
        }
        int data = list.pop();
        insert(list,temp);
        list.push(data);
    }
}

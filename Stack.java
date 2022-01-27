package com.company.leetcode;

public class Stack {
    static final int MAX = 1000;
    int top;
    int a [] = new int[MAX];
    Stack(){
        this.top = -1;
    }
    public void isEmpty(){
        if(top<0){
            System.out.println("stack is empty");
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(112);
        stack.printStack();
        stack.pop();
        stack.printStack();

    }
    public void push(int x){
        a[++top] = x;
    }
    public int pop(){
        return a[--top];
    }
    public int peek(){
        return a[top];
    }
    public void printStack(){
        for (int i = top;i>-1;i--){
            System.out.println(a[i]);
        }
    }
}
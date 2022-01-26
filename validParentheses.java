package com.company.leetcode;

import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "{}[][";
        boolean status = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                stack.push(str.charAt(i));
            } else {
                if(stack.empty()) ;
                char ch = stack.pop();
                if(str.charAt(i) == ')' && ch == '('){}
                else if(str.charAt(i) == '}' && ch == '{'){}
                else if(str.charAt(i) == ']' && ch == '['){}
                else{
                    status = false;
                    break;
                }
            }
        }
        if(status ==false){
            System.out.println("hey it is not valid111");
        } else {
            if(stack.empty()){
                System.out.println("hey it is valid");
            } else {
                System.out.println("hey it is not valid");
            }
        }
    }
}

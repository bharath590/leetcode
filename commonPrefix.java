package com.company.leetcode;

public class commonPrefix {
    public static void main(String[] args) {
        String strs[] = {"dog","racecar","car"};
        String str = ""; // min length string;
        int len = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(len>strs[i].length()){
                str = strs[i];
                len = strs[i].length();
            }
        }
        int i;
        boolean status = true;
        for(i =0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch);
            for (int j=0;j<strs.length;j++){
                System.out.println(strs[j].charAt(i));
                if(strs[j].charAt(i) !=ch) {
                    status = false;
                    break;
                }
            }
            if(status ==false){
                break;
            }
        }
        System.out.println("testtttttttttt"+str.substring(0,i));
    }
}

package com.company.leetcode;

public class ZigZag {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String s1 = "PAHNAPLSIIGYIR";
        int numRows = 3;
        int inr = (numRows-1)*2;
        String str = "";
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=inr){
                str = str+s.charAt(j);
                if(i>0 &&  i<numRows-1&& j+(inr-2*i)<s.length()){
                    str = str + s.charAt(j+(inr-2*i));
                }
            }
        }
        System.out.println("the out put is  : "+str);
    }
}

package com.company.leetcode.Recursion;

public class JumpGame {
    public static void main(String[] args) {
    int nums[] = {3,2,1,0,4};
        int reachable = 0;
        for (int i=0;i<nums.length-1;i++){
                System.out.println(i+nums[i]);
                if(i>reachable) {
                    System.out.println("no  path");
                    break;
                }
                if(i+nums[i]>reachable){
                    reachable = i+nums[i];
                }
            }

    }
    public static boolean jumpGame(int nums[],int steps,int c){
        if(c+steps>=nums.length-1){
            return true;
        }
        if (c<nums.length-1 && nums[c]==0){
            return false;
        }
        boolean reach = false;
        for (int i=1;i<=steps;i++){
            boolean r = jumpGame(nums,nums[c+i],c+i);
            reach = reach || r;
        }
        return reach;
    }
}

package com.company.leetcode.Recursion;

public class JumpGame {
    public static void main(String[] args) {
    int nums[] = {3,2,1,0,4};

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
    public static boolean jumpGameI(int nums[]){
        int reachable = 0;
        for (int i=0;i<nums.length-1;i++){
            System.out.println(i+nums[i]);
            if(i>reachable) {
                return false;
            }
            if(i+nums[i]>reachable){
                reachable = i+nums[i];
            }
        }
        return reachable >=nums.length-1;
    }
    public static boolean jumpGameIV2(int nums[]){
        int reachable = nums.length-1;
        for (int i=nums.length-2; i>=0; i--){
            if(nums[i]+i>=reachable) {
                reachable = i;
            }
        }
        return reachable == 0;
    }

    /**
     * minimum jumps required to reach last;
     * @param nums
     * @return
     */
    public static int jumpGameII(int nums[]){
        int jumps = 0;
        int maxReach = 0;
        int maxJump = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]+i>maxJump){
                maxJump = nums[i]+i;
            }
            /**
             * explore intermiditate steps to find out maxjumps so find the best jump
             */
            if(i==maxReach){
                maxReach = maxJump;
                jumps++;
            }
        }
        return jumps;
    }
}

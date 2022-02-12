package com.company.leetcode.DP;
import java.util.Arrays;
import static com.company.leetcode.DP.SubSetSum.subSetSumDp;

public class EqualSum {
    public static void main(String[] args) {
        int nums[] = {1,5,11,5};
        boolean status = equalSum(nums);
        System.out.println(status);
    }
    public static boolean equalSum(int nums[]){
        int sum =0;
        for (int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        /*
        if sum of array odd we won't get equal some partition
         */
        if(sum%2 == 1) {
           return false;
        }
        int target = sum/2;
        return subSetSumDp(nums,target,nums.length);
    }
}

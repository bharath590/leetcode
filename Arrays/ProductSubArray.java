package com.company.leetcode.Arrays;

import java.lang.reflect.Array;

public class ProductSubArray {
    public static void main(String[] args) {
        int nums[] = {2,-5,-2,-4,3};
        int res = subarraySumV2(nums);
        System.out.println(res);
    }
    public static  int subarraySum(int[] nums) {
        /*
        maintinting both cmax and cuurent min
         */
      int max = nums[0];
      int cmax = nums[0];
      int cmin = nums[0];
      for (int i=1;i<nums.length;i++){
          int temp1 = cmax;
          int tem2 = cmin;
          cmax = Math.max(nums[i],Math.max(temp1*nums[i],tem2*nums[i]));
          cmin = Math.min(nums[i],Math.min(temp1*nums[i],tem2*nums[i]));
          if(cmax>max) max = cmax;
      }
      return max;
    }
    public static  int subarraySumV2(int[] nums) {
        int max = nums[0];
        int prefix = nums[0];
        int suffix = nums[nums.length-1];

        int p = prefix;
        int q = suffix;

        int splocal = 0;
        int sp = 0;
        int ep = 0;

        int eslocal = nums.length-1;
        int ss = nums.length-1;
        int es = nums.length-1;
        for (int i=1;i<nums.length;i++){
            if(p==0){
                splocal = i+1;
                p=1;
            }
            p = p*nums[i];
            if(prefix < p){
                prefix = p;
                sp = splocal;
                ep = i;
            }
            if(q==0){
                q=1;
                eslocal = nums.length-1-i;
            }
            q = q*nums[nums.length-1-i];
            if(q>suffix){
                suffix = q;
                es = eslocal;
                ss = nums.length-1-i;
            }
        }
        int start = 0;
        int end = 0;
        if(prefix<suffix){
            start = ss;
            end = es;
        } else {
            start = sp;
            end = ep;
        }
        System.out.println("start index "+ start + " end index "+ end);
        return Math.max(prefix,suffix);
    }
}

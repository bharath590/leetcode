package com.company.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }
    public  static int maxArea(int[] height){
        int maxArea =0;
        int l = 0;
        int r = height.length-1;
        while (l<=r){
            int maxHeight = Math.min(height[l],height[r]);
            int area = maxHeight *(r-l);
            maxArea = Math.max(maxArea,area);
            if(height[l]>height[r]){
                r--;
            } else{
                l++;
            }
        }
        System.out.println(maxArea);
        return 1;
    }
}

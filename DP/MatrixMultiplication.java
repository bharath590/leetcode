package com.company.leetcode.DP;

public class MatrixMultiplication {
    public static void main(String[] args) {

    }
    public static int leastCost(int nums[],int i,int j){
        int minCost = Integer.MAX_VALUE;
        for (int k=i;k<=j-1;k++){
            int localcost = leastCost(nums,i,k)+leastCost(nums,k+1,j)+(nums[i-1]*nums[k]*nums[j]);
            if(localcost<minCost){
                minCost = localcost;
            }
        }
        return minCost;
    }
}

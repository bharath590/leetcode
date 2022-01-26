package com.company.leetcode;
import java.util.*;
public class threeSumClosest {
    public static void main(String[] args) {
        //-1 -1 1 1 3
        int arr [] = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr,1));
    }
    public static int threeSumClosest(int[] arr, int target) {
        int res = arr[0]+arr[1]+arr[arr.length-1];
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            int l = i+1;
            int r = arr.length-1;
            while(l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if(sum<target){
                    l++;
                }else{
                    r--;
                }
                if(Math.abs(res-target)>Math.abs(sum-target)){
                    res = sum;
                }
            }
        }
        return res;
    }
}

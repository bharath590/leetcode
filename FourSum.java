package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
//        int arr[] = {1,0,-1,0,-2,2};
        int arr[] = {-3,-2,-1,0,0,1,2,3};
        //[[-3,-2,2,3],[-3,-1,1,3],[-3,0,0,3],[-3,0,1,2],[-2,-1,0,3],[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int target = 0;
       System.out.println(fourSum(arr,target));
    }
    public  static List<List<Integer>>  fourSum(int arr[],int target){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0;i<arr.length-3;i++){
            if(i>0&&arr[i]==arr[i-1]) continue;
            for (int j=i+1;j<arr.length-2;j++){
                if(j>i+1&&arr[j]==arr[j-1]) continue;
                int l = j+1;
                int r = arr.length-1;
                while (l<r){
                    int sum = arr[i]+arr[j]+arr[l]+arr[r];
                    if(sum==target){
                        ArrayList<Integer> l1 = new ArrayList<>();
                        l1.add(arr[i]);
                        l1.add(arr[j]);
                        l1.add(arr[l]);
                        l1.add(arr[r]);
                        list.add(l1);
                        while(l < r && arr[l] == arr[l +1]) l++;
                        while(l < r && arr[r] == arr[r - 1]) r--;
                        l++;
                        r--;
                    } else if(sum<target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return  list;
    }
}

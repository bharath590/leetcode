package com.company.leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {1,-1,-1,0};
        //-1 -1 0 0 1 1
        //a+b+c =0;
        //a+b = -c
        System.out.println(threeSumV2(arr));
    }
    public static List<List<Integer>> threeSum(int[] arr) {

            //Set<List<Integer>> set1 = new HashSet<>();

            Set<List<Integer>> set = new HashSet<>();
            Arrays.sort(arr);

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                map.put(arr[i],i);
            }
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1;j<arr.length;j++){
                int sum = -1*(arr[i]+arr[j]);
                if(map.containsKey(sum)&&  j<map.get(sum)){
                    ArrayList<Integer> l1 = new ArrayList<>();
                    l1.add(arr[i]);
                    l1.add(arr[j]);
                    l1.add(sum);
                    set.add(l1);
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }

    public static List<List<Integer>> threeSumV2(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int c = -1*arr[i];
            int l = i+1;
            int r = arr.length-1;
            while (l<r){
                int sum = arr[l]+arr[r];
                if(sum==c){
                    ArrayList<Integer> l1 = new ArrayList<>();
                    l1.add(arr[i]);
                    l1.add(arr[l]);
                    l1.add(arr[r]);
                    list.add(l1);
                    while (l<r){
                        if(arr[l]==arr[l+1]){
                            l++;
                        } else {
                            break;
                        }
                    }
                    while (l<r){
                        if(arr[r]==arr[r-1]){
                            r--;
                        } else {
                            break;
                        }
                    }
                    l++;
                    r--;
                }else if(c>sum){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return  list;
    }
}

package com.company.leetcode;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int num [] = {1,1,2,5,6,7,10};
        List<List<Integer>> list = new ArrayList();
        ArrayList<Integer> com = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(num);
        combinationSumV1(list,com,num,8,0,set);
        System.out.println(list);
    }
    public static void combinationSum(List<List<Integer>> list, ArrayList<Integer> com, int [] num,int target,int index,HashSet<List<Integer>> set){
        if(index>num.length-1){
            return;
        }
        if(target==0){
            if(!set.contains(com)) list.add(new ArrayList<>(com));
            set.add(new ArrayList<>(com));
            return;
        }
        if(target<=0){
            return;
        }
        com.add(num[index]);
        combinationSum(list,com,num,target-num[index],index,set);
        com.remove(com.size()-1);
        combinationSum(list,com,num,target,index+1,set);
    }
    public static void combinationSumV1(List<List<Integer>> list, ArrayList<Integer> com, int [] num,int target,int index,HashSet<List<Integer>> set){
        if(target==0){
//            if(!set.contains(com)) list.add(new ArrayList<>(com));
//            set.add(new ArrayList<>(com));

            list.add(new ArrayList<>(com));
            return;
        }
//        while (index<num.length-1){
//            if(index>0 && num[index]==num[index-1]) index++;
//            else break;
//        }
        for (int i = index;i<num.length;i++){
            if(i>index && num[i]==num[i-1]) continue;
            if(num[i]>target){
                break;
            }
            com.add(num[i]);
            combinationSumV1(list,com,num,target-num[i],i+1,set);
            com.remove(com.size()-1);
        }
    }
}

package com.company.leetcode;

import java.util.*;

//leetcode:#49
public class GroupAnagrams {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(strs);
        System.out.println(list);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> list = new HashMap();
        for (int i=0;i<strs.length;i++){
               char ch[] = strs[i].toCharArray();
               Arrays.sort(ch);
               String str1 = new String(ch);
               if(list.containsKey(str1)){
                   list.get(str1).add(strs[i]);
               } else {
                   list.put(str1,new ArrayList<>());
                   list.get(str1).add(strs[i]);
               }
        }
        return new ArrayList(list.values());
    }
}

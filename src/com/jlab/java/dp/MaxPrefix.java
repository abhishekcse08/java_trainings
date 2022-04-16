package com.jlab.java.dp;

import java.util.HashMap;
import java.util.Map;

/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */
public class MaxPrefix {
    public static void main(String[] args) {
        String[] arr = {"TEST","TESR","TESY","TE"};
        String s = maxPrefix(arr);
        System.out.println(s);
    }

    public static String maxPrefix(String[] arr) {

        String preFix = "";
        for (int i = 1; i < arr[0].length(); i++) {
            String st = arr[0].substring(0, i);
            //System.out.println(st);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].length()>i && !arr[j].substring(0, i).equals(st)) {
                    return preFix;
                }
                preFix = preFix + st;
                preFix.trim();
            }


        }
        return preFix;

    }

}

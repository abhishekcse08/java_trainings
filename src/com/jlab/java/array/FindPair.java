package com.jlab.java.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindPair {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,2,4,4};
        int x = chechPair(arr);
        System.out.println(x);
    }

    public static int chechPair(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], count + 1);
            }
        }
        Iterator itr = map.values().iterator();
        int b =2;

        while (itr.hasNext()){
            int a = (int)itr.next();
            while(a>0 && a%2==0){
            a=a/2;
                count++;
            }
        }
        return count;
    }
}

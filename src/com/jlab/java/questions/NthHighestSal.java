package com.jlab.java.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSal {

    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("A",10000);
        m.put("B",5000);
        m.put("C",11000);
        m.put("D",89000);
        m.put("E",20000);

        Map.Entry<String,Integer> res = findNthSal(2,m);
        System.out.println(res);

    }

    public static Map.Entry<String,Integer> findNthSal(int num,Map<String,Integer> map){

       return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(num-1);

    }
}


// Do the same example with Employee Object
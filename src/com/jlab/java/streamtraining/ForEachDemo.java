package com.jlab.java.streamtraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> ll =new ArrayList<>();
        ll.add("TEST");
        ll.add("WEST");
        ll.add("Tree");
        /*for(String s:ll){
            if(s.startsWith("T")){
                System.out.println(s);
            }
        }*/

       // ll.stream().filter(t->t.startsWith("T")).forEach(e-> System.out.println(e));
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(123,"Data");
        map.forEach((k,v)-> System.out.println(k+"::"+v));
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(j-> System.out.println(j));

    }
}

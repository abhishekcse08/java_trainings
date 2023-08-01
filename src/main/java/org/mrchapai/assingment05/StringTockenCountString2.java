package org.mrchapai.assingment05;

import java.util.*;

public class StringTockenCountString2 {


    public static void main(String[] args) {
        String s = "This is Hyderabad and Hyderabad is very Good  is place";
        Map myMap = new HashMap();

        StringTokenizer sToken = new StringTokenizer(s, " ");
        List<String> ls = new ArrayList<>();

        while (sToken.hasMoreElements()) {
            ls.add(sToken.nextToken());

        }
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < ls.size(); i++) {
            map.put(ls.get(i), 1);
            map.computeIfPresent(ls.get(i), (k, v) -> v + 1);
        }

        Set<String> keys = map.keySet();
        for (String key:keys) {
                System.out.println(key + "->" + map.get(key));
        }




//        Map<String, Integer> words = new HashMap<>();
//        words.put("hello", 9);
//        words.put("world", 4);
//        words.computeIfPresent("hello", (k, v) -> v + 1);
//        words.computeIfPresent("hello", (k, v) -> v + 1);
//        System.out.println(words.get("hello"));






    }
}

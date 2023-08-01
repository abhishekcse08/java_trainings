package org.mrchapai.assingment05;

import java.util.*;

public class StringTockenCountString {


    public static void main(String[] args) {
        String s = "This is Hyderabad and Hyderabad is very Good  is place";
        Map myMap = new HashMap();

        StringTokenizer sToken = new StringTokenizer(s, " ");
        List<String> ls = new ArrayList<>();

        while (sToken.hasMoreElements()) {
            ls.add(sToken.nextToken());

        }

        Map<String, Integer> mycount = new TreeMap<String, Integer>();

        for (int i = 0; i < ls.size(); i++) {
            int count = 1;


            for (int j = i + 1; j < ls.size(); j++) {

                if (ls.get(i).equalsIgnoreCase(ls.get(j))) {
                    count++;
                    mycount.put(ls.get(i),count);

                }

            }
            for (Map.Entry<String, Integer> entry : mycount.entrySet())
            {
                System.out.println(entry.getKey() + " count :" + entry.getValue());
            }
        }



    }
}

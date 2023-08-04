package com.jlab.java.mapreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMapReduce {

    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(4,5,6,78,12);
        int sum= ll.stream().mapToInt(i->i).sum();
        System.out.println(sum);

        int sum1= ll.stream().reduce(2,(a,b)->a-b);
        System.out.println(sum1);

        List<String> ls = Arrays.asList("COREJAVA","MATH","ENGLISH");
        String s = ls.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(s);
    }
}

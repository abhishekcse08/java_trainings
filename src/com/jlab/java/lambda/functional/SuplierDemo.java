package com.jlab.java.lambda.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuplierDemo {
    public static void main(String[] args) {
      //  Supplier<String> sp = (Supplier<String>) new SuplierDemo();
        //sp.get()
       List<String> ll = Arrays.asList("A","B","C");
        //List<String> ll = new ArrayList<>();
       //ll.stream().findAny().orElseGet(()->"Hi Data");
       // System.out.println(ll.stream().findAny().orElseGet(()->"Hi Data"));
        //ll.stream().filter((e)->e.equals("D")).findAny().orElseGet(()->"Nothing");
        System.out.println(ll.stream().filter((t)->t.equals("A")).findAny().orElseGet(()->"Nothing"));
    }
}

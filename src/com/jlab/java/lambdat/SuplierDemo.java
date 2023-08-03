package com.jlab.java.lambdat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Supllier doen't take any input but expect return type
public class SuplierDemo { //implements Supplier<String> {

    public static void main(String[] args) {
       // Supplier<String> sp = new SuplierDemo();
       // System.out.println(sp.get());

       /*Supplier<String> sp =  ()-> {return "Hi Java Data";};
        System.out.println(sp.get() );*/

        List<Integer> ll = Arrays.asList(1,23,12,8,6);
        //ll.stream().findAny().orElseGet(->).
    }
   /* @Override
    public String get() {
        return "Hi Java ";
    }*/
}

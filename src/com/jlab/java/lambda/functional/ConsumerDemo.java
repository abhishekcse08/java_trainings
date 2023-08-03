package com.jlab.java.lambda.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {
    /*@Override
    public void accept(Integer t) {
        System.out.println("Printing data "+t);
    }*/

    public static void main(String[] args) {

        /*Consumer<Integer> c = t-> System.out.println("Printing "+t);
        c.accept(100);*/
        List<Integer> ll = Arrays.asList(1,2,3,4,5,5);
        //ll.stream().forEach(c);

        //ll.stream().forEach(t-> System.out.println("Printing "+t));
    }
}


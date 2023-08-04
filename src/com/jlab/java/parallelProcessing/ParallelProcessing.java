package com.jlab.java.parallelProcessing;

import java.util.stream.IntStream;

public class ParallelProcessing {

    public static void main(String[] args) {
        long start=0;
        long end=0;
         start=System.currentTimeMillis();


        IntStream.range(1,100).forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Serial processing time : "+(end-start));

        System.out.println("===============");
        long startP=0;
        long endP=0;

        startP=System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        endP=System.currentTimeMillis();
        System.out.println("parallel processing time : "+(endP-startP));
    }
}

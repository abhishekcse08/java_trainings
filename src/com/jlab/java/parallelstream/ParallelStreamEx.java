package com.jlab.java.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamEx {

    public static void main(String[] args) {
    /*    long start=0;
        long end=0;
        start = System.currentTimeMillis();
        IntStream.range(1,1000).forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Normal Stream time   :"+ (end-start));
        System.out.println("--------------------------");
        start = System.currentTimeMillis();
        IntStream.range(1,1000).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Parallel Stream time :"+ (end-start));
        System.out.println("--------------------------");*/
        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread "+Thread.currentThread().getName()+" :: "+x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread "+Thread.currentThread().getName()+" :: "+x);
        });
    }
}

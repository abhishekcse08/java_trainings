package com.jlab.java.lambda.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {//implements Predicate<Integer> {
   /* @Override
    public boolean test(Integer t) {
        if(t%2==0) return true ;
        else return false;
      //  return false;
    }*/

    public static void main(String[] args) {
        /*Predicate<Integer> p = new PredicateDemo();
        System.out.println(p.test(4));

        System.out.println(p.test(7));*/

      /*  Predicate<Integer> p = (t) -> {
            if (t % 2 == 0) return true;
            else return false;
        };*/
        List<Integer> ll = Arrays.asList(1,2,3,4,5,5);
       // Predicate<Integer> p = (t) -> t%2==0;
        //System.out.println(p.test(8));
       // ll.stream().filter(p).forEach(t-> System.out.println("print even: "+t));
        ll.stream().filter(p->p%2==0).forEach(t-> System.out.println("print even: "+t));
    }
}
/*
in java strem there is filter method which is used to filter data based on some conditions
in such case we can go with predicate


 */

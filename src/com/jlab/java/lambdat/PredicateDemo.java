package com.jlab.java.lambdat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo { //implements Predicate<Integer> {//implements CheckEvenOdd{
   /* @Override
    public boolean checkIsEven(Integer number) {
        if(number%2==0) return  true;
        else
        return false;
    }*/

    public static void main(String[] args) {
        //PredicateDemo pd = new PredicateDemo();
        //System.out.println(pd.checkIsEven(90));
        List<Integer> ll = Arrays.asList(12,3,5,6,7,8);

       // Predicate<Integer> p = (e)-> e%2==0;
        //System.out.println(p.test(101));

       // ll.stream().filter(p).forEach(e-> System.out.println(e));

        ll.stream().filter(nan->nan%2==0).forEach(e-> System.out.println(e));

        //ll.stream().


    }

    /*@Override
    public boolean test(Integer integer) {
        if(integer%2==0) return  true;
        else
            return false;
    }*/
}




@FunctionalInterface
interface CheckEvenOdd{

    public boolean checkIsEven(Integer number);
}
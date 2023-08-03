package com.jlab.java.lambdat;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {//implements Consumer<Integer> {

    public static void main(String[] args) {
     /* ConsumerDemo cd = new ConsumerDemo();
      cd.accept(90);

      */
        List<Integer> ll = Arrays.asList(12,34,5,67,89,90);


       // Consumer<Integer> c = (item) -> System.out.println("Printing data :" + item);
       // c.accept(10);
        //ll.stream().forEach((c));

        ll.stream().forEach(e-> System.out.println(e));
    }

  /*  @Override
    public void accept(Integer item) {
        System.out.println("Hello Consumer :"+ item);
    }

   */
}

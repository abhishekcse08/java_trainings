package com.jlab.java.lambda;


interface Calculator {
   // void switcOn();
    //void sum(int input);
    int firstSub(int i1,int i2);

}
public class CalculatorImpl {

    public static void main(String[] args) {
       /* Calculator  hello = () -> System.out.println("Hello");
        hello.switcOn();*/
        /*Calculator  hello =   (inpput)-> System.out.println(inpput+2);
        hello.sum(100);*/

        /*Calculator c =( i1, i2)->{
            System.out.println("Hello");
            return i2-i1;
        };*/

        Calculator c =( i1, i2)->  i2-i1;

        System.out.println(c.firstSub(12,45));
    }
}

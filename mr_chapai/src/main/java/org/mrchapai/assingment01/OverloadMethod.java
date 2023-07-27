package org.mrchapai.assingment01;

public class OverloadMethod {

// Overloading method using add

    public  void sum(int a, int b) {
        int c = a + b;
        System.out.println("a = " + a + " , b = " + b + " and sum = " + c);
    }


    public  void sum(float a, int b) {
        float c = a + b;
        System.out.println("a = " + a + " , b = " + b + " and sum = " + c);
    }


    public  void sum(int a, float b) {
        float c = a + b;
        System.out.println("a = " + a + " , b = " + b + " and sum = " + c);
    }

    public  void sum(float a, float b) {
        float c = a + b;
        System.out.println("a = " + a + " , b = " + b + " and sum = " + c);
    }


}

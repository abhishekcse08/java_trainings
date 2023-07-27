package org.mrchapai.assingment01;

public class OverloadRunner    {
    public static void main(String[] args) {

        OverloadMethod obj = new OverloadMethod();

        System.out.println("overloading method" );

        obj.sum(10,20);
        obj.sum(10.5f,20);
        obj.sum(10,20.5f);
        obj.sum(10.f,20.5f);












    }
}

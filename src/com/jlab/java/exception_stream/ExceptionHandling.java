package com.jlab.java.exception_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling {

    public static void main(String[] args) {
           // printData("TEST");
            List<String> ls = Arrays.asList("1","12","DATA");
            ls.forEach(handleEx(s-> System.out.println(Integer.parseInt(s))));


    }

    public static void printData(String s){

        try{
            System.out.println(Integer.parseInt(s));
        }
        catch (Exception e){
            System.out.println("Exception :"+e.getMessage());
        }
    }

    static Consumer<String> handleEx(Consumer<String> cosumer){
        return x->{
            try {
                cosumer.accept(x);
            }
            catch (Exception e){
                System.out.println("in catch block");
            }
        };
    }


   /*static <T> Consumer<T> handleEx(){
        //Checked
   }*/
}

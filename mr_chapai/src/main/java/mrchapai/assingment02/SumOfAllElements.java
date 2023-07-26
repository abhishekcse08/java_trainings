package org.mrchapai.assingment02;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllElements {
    public static void main(String[] args) {


        int[] array = {100, 2, 3, 4, 2, 20, 6, 7, 7, 8, 9};

        int highest = 0;

        int length = array.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {

            sum=sum+array[i];
        }
        System.out.println("length is " + length);
        System.out.println(sum);


    }
}

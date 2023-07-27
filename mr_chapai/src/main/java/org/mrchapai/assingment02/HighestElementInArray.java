package org.mrchapai.assingment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class HighestElementInArray {
    public static void main(String[] args) {
            int[] array = {100, 2, 3, 4, 2, 20, 6, 7, 7, 8, 9};
            int length = array.length;
            int highestValue = array[0];

            for (int i = 0; i < length; i++) {

                if (highestValue < array[i]) {
                    highestValue = array[i];
                }
            }
            System.out.println("length is " + length);
            System.out.println(highestValue);








    }
}

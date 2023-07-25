package org.mrchapai.assingment03;

import java.util.Arrays;

public class TargetMaxValue {


    public static void main(String[] args) {
        int[] myArray = {3, 5, 7, 8, 9, 6, 10, 5, 1};
        int targetMax = myArray[0];
        int[] targetArray=new int[2];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] > targetMax) {

                    targetMax = myArray[i] + myArray[j];
                    targetArray[0]= myArray[i];
                    targetArray[1]= myArray[j];
                }
            }
        }
        System.out.println(targetMax);

        System.out.println(Arrays.toString(targetArray));

    }
}
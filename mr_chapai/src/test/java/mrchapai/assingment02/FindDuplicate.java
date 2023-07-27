package org.mrchapai.assingment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class FindDuplicate {
    public static void main(String[] args) {


        int[] originalArray = {1, 2, 3, 4, 2, 2, 6, 7, 7, 8, 9};
        List<Integer> duplicateNumber = new ArrayList<>();
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if (originalArray[i] == originalArray[j]) {
                    duplicateNumber.add(originalArray[j]);
                }
                break;
            }
        }
        System.out.println(duplicateNumber);


    }
}

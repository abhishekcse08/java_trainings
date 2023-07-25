package org.mrchapai.assingment04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TakeStringAndFindOutDouplicate {


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println(" Enter the String: ");
        String myString = userInput.nextLine();
        findTheDoublicateChar(myString);
        removeDoublicateChar(myString);
    }


    private static void findTheDoublicateChar(String s) {
        char[] newStringArray = s.toCharArray();

        List<Character> duplicateCharacter = new ArrayList<>();
        for (int i = 0; i < newStringArray.length; i++) {
            for (int j = i + 1; j < newStringArray.length; j++) {
                if (newStringArray[i] == newStringArray[j]) {
                    if (!duplicateCharacter.contains(newStringArray[j])) {
                        duplicateCharacter.add(newStringArray[j]);
                    }
                }

            }
        }
        System.out.println(duplicateCharacter.toString());

    }


    private static void removeDoublicateChar(String s) {
        char[] newStringArray = s.toCharArray();

        List<Character> removeDuplicateCharacter = new ArrayList<>();
        for (int i = 0; i < newStringArray.length; i++) {
            if (!removeDuplicateCharacter.contains(newStringArray[i])) {
                removeDuplicateCharacter.add(newStringArray[i]);
            }
        }


        System.out.print("\n before delete douplicate element from array : ");
        for (char a : newStringArray) {
            System.out.print(a);
        }
        System.out.print("\n after delete douplicate element from array : ");
        for (Object b : removeDuplicateCharacter) {
            System.out.print(b);
        }
    }
}

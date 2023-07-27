package org.mrchapai.assingment04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class CheckCharacterPresen {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sn.nextLine();

        System.out.println("Enter the character to check");
        String c = sn.nextLine();
        CheckContainChar(s, c);
    }


    public static void CheckContainChar(String s, String c) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
        list.forEach(System.out::println);
        for (String a : list) {
            if (a.contains(c)) {
                System.out.println("yes it is contain the : " + c);
                break;
            } else {
                System.out.println("Sorry it is not contain the : " + a);
            }

        }
    }
}

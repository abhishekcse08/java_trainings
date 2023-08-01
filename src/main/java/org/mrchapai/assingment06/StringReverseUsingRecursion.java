package org.mrchapai.assingment06;

import java.util.Scanner;

public class StringReverseUsingRecursion {
        public static void main(String[] args) {
            //getttingh string input from user
            Scanner sn = new Scanner(System.in);
            String myString =sn.nextLine();
            //find the length of string
            int size = myString.length();
            //call the method
            StringReverseMethod(myString, size);
        }

        //WAP to reverse string without using String class method
        public static void StringReverseMethod(String s, int len) {
            if (len >0) {
                System.out.print(s.charAt(len-1));
                len--;
                StringReverseMethod(s, len);
            }
        }
}

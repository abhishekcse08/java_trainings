package org.mrchapai.assingment03;

import java.util.Arrays;
import java.util.Scanner;

public class MethodOverLoadBasedOnInput {
    public static void main(String[] args) {


/*
// user Input verify
Scanner sn = new Scanner(System.in);
*/


        Input obj = new Input();
        obj.solution(2);
        obj.solution(2, 5);
        obj.solution("hello");

    }


}

//Overloading method based on user input
class Input {

    //Method to calculate a area of cube
    public void solution(int a) {

        int result = 6 * a * a;
        System.out.println("Are of cub is : " + result);
    }

    //Method to calculate a area of rectangle
    public void solution(int l, int w) {

        int result = l * w;
        System.out.println("Are of Rectangle is : " + result);
    }


    //Method to rverse string
    public void solution(String s) {
        char[] charArray = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

    }

}
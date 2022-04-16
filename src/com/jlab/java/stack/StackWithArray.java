package com.jlab.java.stack;

public class StackWithArray {

    static String[] stack={null,null,null,null,null};
    static  int top = stack.length-1;
    public static void main(String[] args) {
        push("X");
        push("Y");
        traverse();

    }

    public static void push(String data){
        if(top<=stack.length){
            stack[top]=data;
            top--;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public static void pop(){
        if(top==5){
            System.out.println("Stack is empty");
        }
        else{
            stack[top]=null;
            top--;
        }
    }

    public static void traverse(){
        while (top!= stack.length){
            if(stack[top]==null) {
                System.out.println(stack[top]);
                top++;
            }
            else{
                break;
            }
        }
    }
}

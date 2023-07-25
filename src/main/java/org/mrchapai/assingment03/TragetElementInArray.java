package org.mrchapai.assingment03;

public class TragetElementInArray {


    public static void main(String[] args) {

       int [] myArray = {3,5,7,8,9,6,10,5,1} ;


       int targetElement =15;

       for(int i =0; i<myArray.length;i++){
           for(int j =i+1; j<myArray.length;j++){
               if(myArray[i]+myArray[j]==targetElement){
                   System.out.println("Target elemen is "+myArray[i]+" + "+myArray[j]+" ="+targetElement);
                   System.out.println("index "+i+" and index "+j);
                   System.out.println(".......................");
               }
           }
       }



    }







}

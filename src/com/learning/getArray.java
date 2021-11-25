package com.learning;

import java.util.Scanner;

public class getArray {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
//        int [] myArray = getMyArray(2);
//        for (int i=0; i< myArray.length; i++){
//            System.out.println(myArray[i]);
//        }
        int [] myArray2 = {1,2};
        for (int i=0; i< myArray2.length; i++){
            System.out.println(myArray2[i]);
        }
    }

    public static int[] getMyArray(int num) {
        int [] array = new int[num];
        System.out.println("enter number");
        for (int i=0; i<array.length;i++){
           array[i]=sc.nextInt();
        }

        return array;
    }
}

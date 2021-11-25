package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class HmwSortedArray {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] values = getIntegers(2);
        int [] sorted = sortIntegers(values);
        printArray(sorted);
        System.out.println("Value= "+ Arrays.toString(values));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" integer value: \r");
        int [] arrays = new int[number];
        for(int i =0;i<arrays.length;i++){
           arrays[i]= sc.nextInt();
       }
       return arrays;
    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.println("Element "+ i+" contents "+ array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i=0; i<sortedArray.length;i++){
            sortedArray[i]=array[i];
        }
        int temp;
        boolean flag= true;
        while (flag){
            flag=false;
            for (int i=0; i<sortedArray.length-1; i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp =sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

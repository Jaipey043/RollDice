package com.learning;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //User will enter shown number integer value
        int[] enteredNumber = getIntegerValue(5);
        //to print index and given value
        System.out.println("Entered Number= "+ Arrays.toString(enteredNumber));

    }

    private static int[] getIntegerValue(int number) {
        System.out.println("Enter " + number + " Integer value.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }
}

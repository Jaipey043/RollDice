package com.assignments;

public class AllEqual {
    public static void main(String[] args) {
       checkNumber(10,20,30);
       checkNumber(10,10,10);
       checkNumber(0,0,1);
       checkNumber(1,0,0);
       checkNumber(0,1,0);
    }
    //checkNumber method to define given numbers are equal or not
    public static void checkNumber(int a, int b, int c){
        if((a==b) && (b==c) &&(c==a)){
            //if all 3 given numbers are same result show 'equal'
            System.out.println("equal");
        }else
            //if all 3 given numbers are not same result show 'not equal'
            System.out.println("not equal");
    }
}

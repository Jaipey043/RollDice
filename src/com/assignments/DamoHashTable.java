package com.assignments;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class DamoHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> myData = new Hashtable<Integer,Integer>();
        myData.put(3,9);
        myData.put(23,5);
        myData.put(21,54);
        myData.put(4,7);
        myData.put(53,23);
        myData.put(14,46);
        myData.put(9,5);
        myData.put(21,43);
        myData.put(11,9);

        Hashtable<Integer, Integer> myData1 = new Hashtable<Integer,Integer>();
       //
        Hashtable test3 = myData1;

        if(myData == myData1){
            System.out.println( "Is myData == myData1 ?" + true);
        } else System.out.println("Is myData == myData1 ?"+ false);
        //
        if(myData.equals(myData1)){
            System.out.println("Is myData.equals(myData1) ?"+myData.equals(myData1));
        }else System.out.println("Is myData.equals(myData1) ?"+ false);
        //
        if(test3==myData1){
            System.out.println("Is test3==myData1 ?"+ true);
        }else System.out.println("test3==myData1 ?"+ false);
        //
        if (test3.equals(myData)){
            System.out.println("Is test3.equals(myData) ?"+test3.equals(myData));
        }else System.out.println("Is test3.equals(myData) ?"+ false);

        Iterator<Map.Entry<Integer, Integer>> it = myData.entrySet().iterator();
        while (it.hasNext()){
            System.out.println("");
            System.out.println(it.next());
        }

    }
}

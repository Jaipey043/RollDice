package com.miniproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewCsvReader {

    public List<Integer> NunOfBirth(int year){
        String path= "/Users/jatinpatel/IdeaProjects/javaTraining/Resources/yob"+year+"short.csv";
        List<Integer> numOfBirth = new ArrayList<>();
        String line = null;

        try (
            BufferedReader br = new BufferedReader(new FileReader(path))){
            while ((line = br.readLine())!= null){
                String[] value = line.split(",");
                int [] birth = new int[value[2].length()];
                for(int i=0;i< value[2].length();i++){
                    birth[i] = Integer.parseInt(value[2]);
                }
                numOfBirth.add(birth[0]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numOfBirth;
    }


    public int totalBirth(int year) throws FileNotFoundException {
        int sum = 0;
        for (int i: NunOfBirth(year))
            sum+=i;
        System.out.println("Total Birth in year " +year+"= "+sum);
        return sum;
    }
}

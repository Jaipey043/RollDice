package com.miniproject;

import java.io.IOException;

public class BabyNames {

    /*
     *This method returns the total number of births males anf females in file
     */
    public static void main(String[] args) throws IOException {

//        TotalBirth fileResource = new TotalBirth();
//        List<String[]> you2012b = fileResource.yob2012();
         NewCsvReader fr = new NewCsvReader();
         int totalBirth2012 = fr.totalBirth(2012);
         int totalBirth2013 = fr.totalBirth(2013);
         int totalBirth2014 = fr.totalBirth(2014);
        int totalBirth2015 = fr.totalBirth(2015);


    }


}

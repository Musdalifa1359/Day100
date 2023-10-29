package com.mycompany.days21_regexkata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Days21_RegexKata {

    public static void main(String[] args) {
     String kata = "kabupaten : mamasa, provinsi : sulawesi barat, hai, hai, hai ";
     Pattern p = Pattern.compile("hai");
     Matcher m = p.matcher(kata);
     int sum = 0;
     while(m.find()){
         sum ++; 
     }
        System.out.println("di temukan : " + sum + " kali, pada penggunaa kata : hai");
    }
}

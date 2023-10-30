
package com.mycompany.days22_regexabc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Days22_Regexabc {

    public static void main(String[] args) {
       
        String input = "universitas sulawesi barat";
        String regex = "[a,b,c]";       
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Ditemukan kecocokan : " + matcher.group());
        }
    }
}

    


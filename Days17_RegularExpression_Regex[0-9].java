
package com.mycompany.days17_regularexpressionregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Days17_RegularExpressionRegex {

    public static void main(String[] args) {
 
        String text = "jalan Banggae Timur 7L Blok  G18 Nomor 11A";
        Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

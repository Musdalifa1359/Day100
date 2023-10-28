package com.mycompany.days20_stringreplace;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Days20_StringReplace {

    public static void main(String[] args) {
        String text = "nama : Musdalifa, Program studi : Teknik Informatika, Fakultas Teknik, Universitas Sulawes Barat";
        Pattern p = Pattern.compile("ifa"); 
        Matcher m = p.matcher(text);
        String newText = m.replaceAll("xyz"); 
        System.out.println(newText); 
    }
}

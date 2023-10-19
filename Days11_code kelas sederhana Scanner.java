Termasuk jenis codingan apakah  ini dalam bahasa java?"

package com.mycompany.days11_scanner;

import java.util.Scanner;

public class Days11_Scanner {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int nilaiPreTest = 60;//nilai yang dimasukkan
       if(nilaiPreTest>50){//jika lebih besar dari 50 maka di nyatakan lulus apabila sebaliknya akan di nyatkan tidak lulus 
           System.out.println("Lulus");
       }else{
           System.out.println("Tudak lulus");
       }
    }
}

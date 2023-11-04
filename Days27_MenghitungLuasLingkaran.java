package com.mycompany.days27_menghitungluaslingkaran;

import java.util.Scanner;

public class Days27_MenghitungLuasLingkaran {

    public static void main(String[] args) {
        final double PI = 1.567;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = PI * jariJari * jariJari;

        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " yaitu : " + luas);

  
       
    }
}

   

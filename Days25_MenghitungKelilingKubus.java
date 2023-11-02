package com.mycompany.days25_menghitungkelilingkubus;

import java.util.Scanner;

public class Days25_MenghitungKelilingKubus {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus : ");
        double sisi = input.nextDouble();     
        double keliling = 12 * sisi;

        System.out.println("Keliling kubus adalah : " + keliling);

        input.close();
    }
}

    


package com.mycompany.days23_hitungkelilingsegitiga;

import java.util.Scanner;

public class Days23_HitungKelilingSegitiga {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("panjang sisi pertama: ");
        double sisi1 = input.nextDouble();
        System.out.print("panjang sisi kedua: ");
        double sisi2 = input.nextDouble();
        System.out.print("panjang sisi ketiga: ");
        double sisi3 = input.nextDouble();
        
        double keliling = sisi1 + sisi2 + sisi3;
        
        System.out.println("Keliling segitiga adalah: " + keliling);
        
        input.close();
    }
}

    


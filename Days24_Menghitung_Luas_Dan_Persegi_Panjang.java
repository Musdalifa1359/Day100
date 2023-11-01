
package com.mycompany.days24_persegipanjang;

import java.util.Scanner;


public class Days24_PersegiPanjang {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang adalah: " + luas);
        System.out.println("Keliling persegi panjang adalah: " + keliling);

        input.close();
    }
}

    


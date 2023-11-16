
package com.mycompany.days39_menghitungpersegi;

import java.util.Scanner;


public class Days39_MenghitungPersegi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");

        double panjangSisi = scanner.nextDouble();

        double luas = panjangSisi * panjangSisi;

        double keliling = 4 * panjangSisi;

        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);

    }
}


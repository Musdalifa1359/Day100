package com.mycompany.days58_menghitungjumlahjarakdata;

import java.util.Scanner;

public class Days58_MenghitungJumlahJarakData {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data jarak: ");
        int jumlahData = scanner.nextInt();

        double totalJarak = 0;

        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan data jarak ke-" + i + ": ");
            double dataJarak = scanner.nextDouble();

            totalJarak += dataJarak;
        }

        System.out.println("\nJumlah total jarak: " + totalJarak);

    }
}

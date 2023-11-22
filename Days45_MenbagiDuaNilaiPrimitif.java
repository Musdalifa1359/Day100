package com.mycompany.days45_membagiduanilaiprimitif;

import java.util.Scanner;

public class Days45_MembagiDuaNilaiPrimitif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        double nilai1 = scanner.nextDouble();

        System.out.print("Masukkan nilai kedua: ");
        double nilai2 = scanner.nextDouble();

        scanner.close();
        if (nilai2 != 0) {
            double hasil = nilai1 / nilai2;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
        }
    }
}


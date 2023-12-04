package com.mycompany.dayas57_membuatbalok;

import java.util.Scanner;

public class Dayas57_MembuatBalok {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        double volume = hitungVolume(panjang, lebar, tinggi);
        double luasPermukaan = hitungLuasPermukaan(panjang, lebar, tinggi);
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Volume Balok: " + volume);
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
    }
    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }
    public static double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

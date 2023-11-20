

package com.mycompany.days43_menghitunggaji;

import java.util.Scanner;


public class Days43_MenghitungGaji {

    public static void main(String[] args) {
       
        String namaKaryawan;
        int idKaryawan;
        int golongan;
        int jumlahHariMasuk;
        int gajiPokok;
        int tunjangan;
        int pajak;
        int totalGaji;

        Scanner input = new Scanner(System.in);
        System.out.print("Nama karyawan: ");
        namaKaryawan = input.nextLine();
        System.out.print("ID karyawan: ");
        idKaryawan = input.nextInt();
        System.out.print("Golongan: ");
        golongan = input.nextInt();
        System.out.print("Jumlah hari masuk: ");
        jumlahHariMasuk = input.nextInt();

        gajiPokok = 5000000;
        switch (golongan) {
            case 1:
                gajiPokok += 1000000;
                break;
            case 2:
                gajiPokok += 2000000;
                break;
            case 3:
                gajiPokok += 3000000;
                break;
        }

        tunjangan = 10/100 * gajiPokok;

        pajak = 5/100 * gajiPokok;

        totalGaji = gajiPokok + tunjangan - pajak;

        System.out.println("Nama karyawan: " + namaKaryawan);
        System.out.println("ID karyawan: " + idKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jumlah hari masuk: " + jumlahHariMasuk);
        System.out.println("Gaji pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total gaji: " + totalGaji);
    }
}


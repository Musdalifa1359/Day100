package com.mycompany.days49_menghitungstokbarang;

import java.util.Scanner;

public class Days49_MenghitungStokBarang {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah stok awal: ");
        int stokAwal = scanner.nextInt();
        System.out.print("Masukkan jumlah barang yang masuk: ");
        int barangMasuk = scanner.nextInt();
        System.out.print("Masukkan jumlah barang yang keluar: ");
        int barangKeluar = scanner.nextInt();
        int stokAkhir = stokAwal + barangMasuk - barangKeluar;
        System.out.println("Stok akhir barang: " + stokAkhir);

    }
}


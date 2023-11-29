
package com.mycompany.days52_mencaribarang;

import java.util.ArrayList;
import java.util.List;

public class Days52_MencariBarang {

    public static void main(String[] args) {
        
        List<String> barang = new ArrayList<>();
        barang.add("Termos");
        barang.add("Kertas");
        barang.add("Pulpen");
        barang.add("Gelang");
        barang.add("ikat rambut");
        barang.add("kain");

        String barangDicari = "ikat rambut";
        boolean barangDitemukan = barang.contains(barangDicari);

        if (barangDitemukan) {
            System.out.println("Barang " + barangDicari + " ditemukan");
        } else {
            System.out.println("Barang " + barangDicari + " tidak ditemukan");
        }
    }
}


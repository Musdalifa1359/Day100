package com.mycompany.days51_pemisahanbilanganbulatpositifdannegatif;

import java.util.ArrayList;
import java.util.List;

public class Days51_PemisahanBilanganBulatPositifDanNegatif {

    public static void main(String[] args) {
      
        int[] arrayBilangan = {5, -3, 8, -2, 0, 7, -1, 4};

        List<Integer> bilanganPositif = new ArrayList<>();
        List<Integer> bilanganNegatif = new ArrayList<>();

        for (int bilangan : arrayBilangan) {
            if (bilangan >= 0) {
                bilanganPositif.add(bilangan);
            } else {
                bilanganNegatif.add(bilangan);
            }
        }

        System.out.println("Bilangan Positif: " + bilanganPositif);
        System.out.println("Bilangan Negatif: " + bilanganNegatif);
    }
}



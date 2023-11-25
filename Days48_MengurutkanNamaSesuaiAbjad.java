package com.mycompany.days48_urutansesuaiabjad;

import java.util.Arrays;

public class Days48_UrutanSesuaiAbjad {

    public static void main(String[] args) {

        String[] namaArray = {"boy", "dewi", "efa", "asraf", "chika", "fito"};

        Arrays.sort(namaArray);

        System.out.println("Nama setelah diurutkan:");
        for (String nama : namaArray) {
            System.out.println(nama);
        }
    }
}


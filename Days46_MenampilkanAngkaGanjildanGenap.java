
package com.mycompany.days46_angkaganjilgenap;

import java.util.ArrayList;
import java.util.List;

public class Days46_AngkaGanjilGenap {

    public static void main(String[] args) {
        List<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(11);
        angka.add(13);
        angka.add(4);
        angka.add(5);
        angka.add(6);
        angka.add(7);
        angka.add(8);
        angka.add(9);
        angka.add(10);
        List<Integer> angkaGenap = new ArrayList<>();
        List<Integer> angkaGanjil = new ArrayList<>();
        for (int i = 0; i < angka.size(); i++) {
            if (angka.get(i) % 2 == 0) {
                angkaGenap.add(angka.get(i));
            } else {
                angkaGanjil.add(angka.get(i));
            }
        }
        System.out.println("Angka genap: " + angkaGenap);
        System.out.println("Angka ganjil: " + angkaGanjil);
    }
}

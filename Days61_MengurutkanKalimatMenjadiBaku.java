package com.mycompany.days61_mengurutkankalimat;

import java.util.Arrays;


public class Days61_MengurutkanKalimat {

    public static void main(String[] args) {
    
        String kalimatSalah = "ke pasar pergi saya";

        String[] kata = kalimatSalah.split("ke pasar pergi saya");

        Arrays.sort(kata);

        String kalimatBenar = String.join(" saya pergi ke pasar", kata);

        System.out.println(kalimatBenar);
    }
}


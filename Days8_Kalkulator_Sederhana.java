
package days8_kalkulatorsederhana;

import java.util.Scanner;

public class Days8_Kalkulatorsederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("silahkan masukkan angka pertama: ");
        double angka_1 = scanner.nextDouble();
        System.out.print("silahkan masukkan angka kedua: ");
        double angka_2 = scanner.nextDouble();
        
       

        System.out.println("Hasil Penjumlahan: " + (angka_1 + angka_2));
        System.out.println("Hasil Pengurangan: " + (angka_1 - angka_2));
        System.out.println("Hasil Perkalian: " + (angka_1 * angka_2));
        System.out.println("Hasil Pembagian: " + (angka_1 / angka_2));
        System.out.println(".....~T E R I M A K A S I H~.....");

        
    }
   }

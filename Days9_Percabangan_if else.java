
package days9_percabangan;

import java.util.Scanner;

public class Days9_Percabangan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka yang anda inginkan : ");
        int angka = scanner.nextInt();
        if (angka > 0) {
            System.out.println("Angka yang anda masukkan adalah angka positif");
        } else if (angka == 0) {
            System.out.println("Angka yang anda masukkan adalah angka nol");
        } else {
            System.out.println("Angka yang anda masukkan adalah angka  negatif");
        }
   
       
    }
}


package days26_menghitungbarang;

import java.util.Scanner;

public class Days26_MenghitungBarang {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang ifa ambil : ");
        int jumlahBarang = input.nextInt();
        double totalHarga = 0;
        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.print("Masukkan harga barang ke-" + i + ": ");
            double hargaBarang = input.nextDouble();
            totalHarga += hargaBarang;
        }
       System.out.println("Total harga barang yang ifa belanja: " + totalHarga);
        
    }
}

    
    


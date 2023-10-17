
package days2;

import java.util.Scanner;

public class Days2 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
        System.out.println("# biodata mahasiswa");
        System.out.println("===================");
        System.out.println();
        
        String nama;
        String nim;
        String jurusan;
        int umur;
        double tinngi;
        
        System.out.println("Nama mahasiswa: ");
        nama = input.nextLine();
        
        System.out.println("Nim: ");
        nim = input.nextLine();
        
        System.out.println("Jurusan apa: ");
        jurusan = input.nextLine();
        
        System.out.println("Umur: ");
        umur = input.nextInt();
        
        System.out.println("Tinggi badan: ");
        double tinggi = input.nextDouble();
                
    }
    
}

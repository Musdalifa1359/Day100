
package com.mycompany.menampilkannilai;


public class Menampilkannilai {

    public static void main(String[] args) {
        System.out.println("masukan nilai:");
        int nilai = Integer.parseInt(System.console().readLine());
        
        
        if (nilai >= 90){
            System.out.println("A");
        }else if (nilai >= 80){
            System.out.println("B");
        }else if (nilai >= 70){
            System.out.println("C");
        }else if (nilai >= 60){
            System.out.println("D");
        }else{
            System.out.println("Nilai tidak ada");
        }
            
        
        
           
 }
}  

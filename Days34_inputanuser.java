
package com.mycompany.days34_inputanuser;

import java.util.Scanner;

public class Days34_InputanUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ifa silahkan memasukkan  sebuah kalimat: ");
        String userInputString = scanner.nextLine();
        System.out.println("Anda memasukkan: " + userInputString);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int userInputInt = scanner.nextInt();
        System.out.println("Anda memasukkan bilangan bulat: " + userInputInt);

        System.out.print("Masukkan sebuah bilangan pecahan: ");
        double userInputDouble = scanner.nextDouble();
        System.out.println("Anda memasukkan bilangan pecahan: " + userInputDouble);
      
    }
}


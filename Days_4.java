
package perbandingandays4;

import java.util.Scanner;


public class PerbandinganDays4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();
 
        if (bilangan1 > bilangan2) {
            System.out.println(bilangan1 + " lebih besar dari " + bilangan2);
        } else if (bilangan1 < bilangan2) {
            System.out.println(bilangan1 + " lebih kecil dari " + bilangan2);
        } else {
            System.out.println("Kedua bilangan sama besar, yaitu " + bilangan1);
        }

        scanner.close();
    }
}
    
    


package com.mycompany.days44_menghitungnilairata2mean;

public class Days44_MenghitungNilaiRata2Mean {

    public static void main(String[] args) {

        double[] data = {1, 2, 3, 4, 5, 6, 7};
        int size = data.length;
        double mean = 0.0;
        for (double a : data) {
            mean += a;
        }
        mean /= size;

        System.out.println("Rata-rata: " + mean);
    }
}



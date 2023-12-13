
package days66_pemisahannilai;

import java.util.ArrayList;
import java.util.List;

public class Days66_PemisahanNilai {

    public static void main(String[] args) {
        
        List<Integer> nilai = new ArrayList<>();
        nilai.add(90);
        nilai.add(85);
        nilai.add(80);
        nilai.add(75);
        nilai.add(70);
        nilai.add(65);
        nilai.add(60);

        int Q1 = nilai.get(nilai.size() / 4);
        int Q2 = nilai.get(nilai.size() / 2);
        int Q3 = nilai.get(3 * nilai.size() / 4);

        List<Integer> nilaiRendah = new ArrayList<>();
        List<Integer> nilaiTinggi = new ArrayList<>();
        for (int n : nilai) {
            if (n <= Q1) {
                nilaiRendah.add(n);
            } else if (n > Q3) {
                nilaiTinggi.add(n);
            }
        }

        System.out.println("Nilai rendah: " + nilaiRendah);
        System.out.println("Nilai tinggi: " + nilaiTinggi);
    }
}



package days64_pembagianjadwalpiket;

import java.util.Random;

public class Days64_PembagianJadwalPiket {

    public static void main(String[] args) {
     
        String[] siswa = {"Musdalifa", "rahmayani", "ima", "taufik", "madam", "rajab", "ramadan", "hijas", "adriawan", "alim", "fatwa", "dini", "ifa", "faras", "zaki"};

        String[] jadwalPiket = new String[siswa.length];

        Random random = new Random();
        for (int i = 0; i < jadwalPiket.length; i++) {
            jadwalPiket[i] = siswa[random.nextInt(siswa.length)];
        }
        for (int i = 0; i < jadwalPiket.length; i++) {
            System.out.println("Hari " + (i + 1) + ": " + jadwalPiket[i]);
        }
    }
}



public class Days41_PerulanganDouble {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        int i = 0;
        int j = 0;
        while (i < 10) {
            while (j < 10) {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        j = 0;
        do {
            do {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            } while (j < 10);
            i++;
            j = 0;
        } while (i < 10);
    }
}

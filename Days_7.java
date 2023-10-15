package days7operatorlogika;


public class Days7operatorLogika {


    public static void main(String[] args) {
        boolean ifa = true;
        boolean mus = false;
        
        boolean hasilAND = ifa && mus;
        boolean hasilOR = ifa || mus;
        boolean hasilNOT = !ifa;
        
        System.out.println("Hasil AND: " +hasilAND);
        System.out.println("Hasil OR: " +hasilOR);
        System.out.println("Hasil NOT:  "+hasilNOT);
    }
    
}

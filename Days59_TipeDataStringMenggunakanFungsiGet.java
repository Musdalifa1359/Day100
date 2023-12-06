package musdalifa59;


public class Musdalifa59 {

   
    public static void main(String[] args) {
        String nama = "musdalifa";
        
        char karakterPertama = nama.charAt(0);
        System.out.println("karakter pertama: "+karakterPertama);
        
        char karakterTerakhir = nama.charAt(nama.length()-1);
        System.out.println("karakter terakhir: "+karakterTerakhir);
        
        String subString = nama.substring(1,3);
        System.out.println("subString: "+subString);
    }
    
}

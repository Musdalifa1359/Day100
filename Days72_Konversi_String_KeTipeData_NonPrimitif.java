public class Days72_musdalifa {

    
    public static void main(String[] args) {
    
        
        String angka = "123";
        String desimal = "123.456";
        String benar = "true";

        int bilangan = Integer.parseInt(angka);
        double angkaDesimal = Double.parseDouble(desimal);
        boolean kondisi = Boolean.parseBoolean(benar);

        Integer bilanganObject = Integer.valueOf(angka);
        Double angkaDesimalObject = Double.valueOf(desimal);
        Boolean kondisiObject = Boolean.valueOf(benar);

        System.out.println("Bilangan = " + bilangan);
        System.out.println("Angka desimal = " + angkaDesimal);
        System.out.println("Kondisi = " + kondisi);
        System.out.println("Bilangan object = " + bilanganObject);
        System.out.println("Angka desimal object = " + angkaDesimalObject);
        System.out.println("Kondisi object = " + kondisiObject);
    }
}

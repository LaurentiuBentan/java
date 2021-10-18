public class Tema1 {
    public static void main(String[] args) {


        //Scrie 3 variabile din fiecare tip de date primitiv + String
        // 1. int
        int pagini = 10;
        System.out.println(pagini);
        int masini = 23;
        System.out.println(masini);
        int erori = 55;
        System.out.println(erori);

        final int LIMITA_DE_VITEZA = 50;
        System.out.println(LIMITA_DE_VITEZA);
        final int PRET = 5;
        System.out.println(PRET);
        final int KM_CLUJ_BRASOV = 273;
        System.out.println(KM_CLUJ_BRASOV);

        //2.double

        double monitor_cm = 20.4;
        System.out.println(monitor_cm);
        double grade = 8.15;
        System.out.println(grade);
        double inaltime = 1.84;
        System.out.println(inaltime);

        //3.float

        float monitor_cm2 = 20.4f;
        System.out.println(monitor_cm2);
        float grade2 = 8.15f;
        System.out.println(grade2);
        float inaltime2 = 1.84f;
        System.out.println(inaltime2);
        float inaltime3 = 1.84f;
        System.out.println(inaltime3);

        //4. long

        long km = 700981;
        System.out.println(km);
        long metri = 70098100;
        System.out.println(metri);
        long cm = 700981000;
        System.out.println(cm);

        //5. boolean

        boolean sunt_vinovat = false;
        System.out.println(sunt_vinovat);
        boolean nu_sunt_vinovat = true;
        System.out.println(nu_sunt_vinovat);
        boolean altcineva_este_vinovat = true;
        System.out.println(altcineva_este_vinovat);

        //6. String

        String non_primitiva = "este creata de oameni";
        String tipuri_de_primitive = "int double float long boolean";
        System.out.println(non_primitiva.toUpperCase());
        System.out.println(tipuri_de_primitive.toUpperCase());
        System.out.println(non_primitiva.length());
        System.out.println(tipuri_de_primitive.length());

        //whether x is a multiple of y

        int x = 4;
        int y = 2;
        System.out.println(x%y==0);

        //whether x is between -2 and 13

        System.out.println(x>=-2 && x<=13);
        //x=-3false cu x=10true cu x=19 false

        //whether the difference between x and y is less than 5
        System.out.println(x-y<=5);
        //x=10false x=6 true x=18false

        //whether x is not between 5 and 27
        System.out.println(x<5 || x>27);
        //x=6 false x=4 true x=26 false x=28 true

        //whether x has more than 3 digits
        System.out.println(x>=100);
        //x=4 false x=100 true x=199 true x=1990 true

        // whether x has exactly 4 digits
        System.out.println(x>=1000 && x<=9999);
        //x=4 false x=1000 true x=1765 true x=10000 false






























    }

}

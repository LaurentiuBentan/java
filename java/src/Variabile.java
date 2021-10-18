import java.util.Locale;

public class Variabile {
    public static void main(String[] args) {
        //tipul de date, numele, operator de atribuire, valoare, end of statement;
        int varsta = 20;
        System.out.println(varsta); //apelare variabila

        //declarare si initializare
        int persoane = 10;

        //declarare
        int animale;
        //initializare
        animale = 15;
        //suprascriere
        animale = 16;
        System.out.println(animale);

        //constanta
        final int MAJORAT = 18;

        //double
        double pi = 3.14;
        //float
        float pi2 = 3.14f;
        System.out.println(pi2);
        //long
        long numar_mare = 5550213212301238213L;
        //boolean
        boolean is_admin = false;
        //char
        char a = 'a';
        //String
        String nume = "Bentan";
        String prenume = "Laurentiu";
        System.out.println(nume.toUpperCase());
        System.out.println(prenume.toLowerCase());
        System.out.println(nume + " " + prenume);

        //adunare
        int x = 3;
        int y = 7;
        System.out.println(x+y);
        x = x+3;
        System.out.println(x);
        //modulo (restul impartirii)
        System.out.println(y%x);
        //comparare
        System.out.println(x==y);
        System.out.println(x<y);
        //operatori logici=x && y==7);//and
        System.out.println(x==y || y==y);
                System.out.println (x==7);//or
        System.out.println(x==1 && y==6);
        System.out.println(x==y || y==8);

        //verificati daca x este numar pozitiv
        System.out.println(x>=0);




    }

}

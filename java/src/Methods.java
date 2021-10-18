public class Methods {
    public static int salariu;

    // public = poate fi accesata din orice clasa
    // static = poate fi apelata fara a a vea nevoie de un obiect (oop)
    // void = nu returneaza nimic ca si output
    // numele metodei, incepe cu litera mica, urmat de paranteze rotunde
    public static void printGreetings() {
        System.out.println("Hello!");
        System.out.println("Goodbye!");
        int x = 3;
        int y = 6;
        int n = x + y;
    }

    // name este un parametru/argument de tip String
    // ajuta metoda sa fie dinamica in f de valoarea primita la apelare
    public static void printHelloPerson(String name) {
        // e o variabila de tip string care traieste doar in corpul metodei
        name = name.toUpperCase();
        System.out.println("Hello " + name);
    }

    // String e tipul de date returnat
    // return care semnaleaza ce valoare va returna functia
    // dupa return nu se mai executa cod in metoda
    public static String prettyName(String nume, String prenume) {
        String full_name = nume + " " + prenume;
        full_name = full_name.toUpperCase();
        return full_name;
    }

    // metoda fara parametrii dar cu return
    public static double piValue() {
        return 3.14;
    }

    public static void main(String[] args) {
        // apelam metoda printGreeting de cate ori dorim
        // putem ajunge la corpul f prin CTRL+click stanga
        printGreetings();
        printGreetings();

        //printHelloPerson("Andy");
        printHelloPerson("Ana");
        printHelloPerson("Laurentiu"); // String name = "Laurentiu"

        // ca si parametru la print, dam functia (indirect, rezultatul ei)
        //System.out.println(prettyName("Sinpetrean", "Andy"));
        String nume_complet2 = prettyName("andy" , "S");
        System.out.println(nume_complet2);

        // cand o functie returneaza ceva (output), putem sa pastram rezultatul intr-o variabila
        String nume_complet = prettyName("Sinpetrean", "Andy");
        System.out.println(nume_complet.toLowerCase());

        double pi = piValue();
        System.out.println(pi);

    }
}
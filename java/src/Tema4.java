public class Tema4 {
    public static void main(String[] args) {
    printBunaZiua();
    culoarePreferata("Mov");
    System.out.println(cateLitereSunt("Bentan", "Laurentiu"));
    System.out.println(arieCerc(5.0));
    System.out.println(parImpar(7));
    System.out.println(parImpar(4));
    System.out.println(sumaDeTipDouble(2.5, 7.2));
    System.out.println(vocala('e'));
    System.out.println(vocala2('E'));




    }
    //1. Metoda simpla, fara parametrii, fara return, care doar printeaza pe
    //ecran "Buna ziua!"
    public static void printBunaZiua() {
        System.out.println("Buna Ziua");
    }

//    2. Metoda fara return, care primeste un parametru de tip String culoare
//    si printeaza pe ecran Culoarea mea preferate este ...

    public static void culoarePreferata(String culoare){
        System.out.println("culoare mea preferata este " + culoare);
    }

//    3. Metoda care returneaza un int, care reprezinta cate litere are un
//    nume + prenume.

    public static int cateLitereSunt(String nume, String prenume){
        return nume.length() + prenume.length();
    }

    //4. Fa o metoda care sa calcuelze aria unui cerc

    public static double arieCerc(double raza ){
        double aria = 3.14 * raza * raza;
        return aria;
    }

    //5. Metoda care sa returneze true/false la intrebarea "este numarul par?"

    public static boolean parImpar (int nr){
        System.out.println("este numar par?");
        if (nr %2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //6. Metoda care sa calculeze suma a 2 numere de tip double

    public static double sumaDeTipDouble(double nr1, double nr2){
        double suma = nr1 + nr2;
        return suma;
    }
    //7. Metoda care sa returneze true daca un char e vocala

    public static boolean vocala(char litera){
        char[] vocale = {'a', 'e', 'i', 'o', 'u'};
        if(litera == 'a' || litera == 'e'|| litera == 'i'|| litera == 'o'|| litera == 'u'){
            return true;
        }else{
            return false;
        }
    }
    public static boolean vocala2(char litera){
        char[] vocale = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char vocala : vocale){
            if (vocala == litera){
                return true;
            }
        }
        return false;
    }





}

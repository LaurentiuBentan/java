import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tema3 {
    public static void main(String[] args) {
        String[] animale = {"caine", "pisica", "porc", "vaca", "soarece", "cal"};
        //Declara un array cu 7 animale. (String)
//        String[] animale = new String[7];
//        animale[0] = "caine";
//        animale[1] = "pisisca";
//        animale[2] = "porc";
//        animale[3] = "vaca";
//        animale[4] = "soarece";
//        animale[5] = "cal";
//        animale[6] = "iepure";
        //Afiseaza dimensiunea lui cu length
        System.out.println(animale.length);

        //Foloseste un for each ca sa le afisezi pe toate. hint: for (animal :
        //animals)
        for (String animal : animale) {
            System.out.println(animal);
        }
        //Foloseste un For ca sa parcurgi array si sa afisezi toate elementele
        //inafara de primul si ultimul.


        for (int i = 1; i<animale.length-1;i++){

            System.out.println(animale[i]);
        }
        //Inlocuieste ultimul animal din array cu alt animal.
//        animale[6] = "hamster";
        animale[animale.length-1] = "leu";

        for (int i = 0; i<animale.length;i++){
            System.out.println(animale[i]);
        }

        //Printeaza doar ultimul animal din array.
        System.out.println(animale[animale.length-1]);


        //Declara o Lista goala cu numele primul_unsprezece.
        List <String> primul_unsprezece = new ArrayList<String>();
        //Adauga 11 jucatori de fotbal
        primul_unsprezece.add("Leo Messi");
        primul_unsprezece.add("Virgil Van Dijk");
        primul_unsprezece.add("Sadio Mane");
        primul_unsprezece.add("Cristiano Ronaldo");
        primul_unsprezece.add("Mohamed Salah");
        primul_unsprezece.add("Kylian Mbappe");
        primul_unsprezece.add("Robert Lewandowski");
        primul_unsprezece.add("Raheem Sterling");
        primul_unsprezece.add("Alisson Becker");
        primul_unsprezece.add("Frenkie de Jong");
        primul_unsprezece.add("Roberto Firmino");

        //printeaza lista cu ajutorul unui for
        for (int i = 10; i<primul_unsprezece.toArray().length;i++){
            System.out.println(primul_unsprezece);
        }
        int time = 60;
        //facem 3 schimbari
        primul_unsprezece.remove("Roberto Firmino");
        primul_unsprezece.remove("Frenkie de Jong");
        primul_unsprezece.remove("Sadio Mane");
        System.out.println("dupa cele 3 schimbari");
        for (String jucator : primul_unsprezece){ //pentru fiecare jucator (care e un string), din lista primul_unsprezece
            System.out.println(jucator);
        }
        primul_unsprezece.add("rez1");
        primul_unsprezece.add("rez2");
        primul_unsprezece.add("rez3");
        System.out.println("dupa cele 3 inlocuiri");
        for (String jucator : primul_unsprezece){ //pentru fiecare jucator (care e un string), din lista primul_unsprezece
            System.out.println(jucator);
        }

        int[] numbers = {21, 3, 5, 100, 200}; // initializam un array cu valori
        int max = numbers[0]; // presupunem ca cel mai mare numar este chiar primul element

        // facem un for prin care traversam array-ul, incepand de la al 2-lea element
        for (int i = 1; i<numbers.length; i++) {
            // daca al 2lea elem este mai mare ca primul
            if (numbers[i] > max) {
                // atunci maximul este al 2lea element
                max = numbers[i];
                System.out.println("ajunge o data pt " + numbers[i]);
            }
            // altfel, nu fac nimic
        }
        // afisam max
        System.out.println("Max este " + max);





















    }}


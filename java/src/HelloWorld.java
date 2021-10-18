import java.util.ArrayList;
import java.util.List;

public class HelloWorld {


    public static void main(String[] args) {
        //acesta este un comment, nu va fi interpretat de java
//        System.out.println("Hello, World 2021!");
        /*comment
        comment
        comment
         */
        System.out.println(Metode.arieDreptunghi(5,3));
        int arie2 = Metode.arieDreptunghi(7,2);
        System.out.println(arie2);

        Metode.ariePatrat(7);
        Metode.ariePatrat(9);

        Metode.doNothing();

        List<String> primul_unsprezece = new ArrayList<String>();

        primul_unsprezece.add("Leo Messi");
        primul_unsprezece.add("Virgil Van Dijk");
        primul_unsprezece.add("Sadio Mane");
        primul_unsprezece.add("Cristiano Ronaldo");
        primul_unsprezece.add("Mohamed Salah");

        Metode.afiseaza_primul_unsprezece(primul_unsprezece);
        Metode.efectueazaSchimbarea(primul_unsprezece, "Leo Messi", "rezerva1");
        Metode.efectueazaSchimbarea(primul_unsprezece, "Sadio Mane", "rezerva2");
        System.out.println("dupa schimbari");
        Metode.afiseaza_primul_unsprezece(primul_unsprezece);

    }

}
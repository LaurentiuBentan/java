import java.util.ArrayList;
import java.util.List;

public class TemaNr3 {
    public static void main(String[] args) {
        //Declara un array cu 7 animale. (String)

        List<String> animale = new ArrayList<String>();
        animale.add("caine");
        animale.add("pisica");
        animale.add("porc");
        animale.add("vaca");
        animale.add("soarece");
        animale.add("cal");
        animale.add("iepure");
        //Afiseaza dimensiunea lui cu length
        System.out.println(animale.size());

        //Foloseste un for each ca sa le afisezi pe toate. hint: for (animal :
        //animals)
        for (String animal : animale) {
            System.out.println(animale);
        }
        //Foloseste un For ca sa parcurgi array si sa afisezi toate elementele
        //inafara de primul si ultimul.

//        for (String animal : animale){
//            System.out.println(animale.get(animale.
//        }
    }

}
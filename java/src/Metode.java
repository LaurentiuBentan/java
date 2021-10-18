import java.util.List;

public class Metode {
    //afisati aria unui dreptunghi
    public static int arieDreptunghi(int lungime, int latime){
        int aria = lungime * latime;
        return aria;
    }

    public static int ariePatrat(int latura){
        int aria = latura * latura;
        System.out.println("aria patratului este"+aria);
        return aria;
    }

    public static void doNothing(){

    }
    public static void afiseaza_primul_unsprezece(List<String> jucatori){
        for (String jucator : jucatori){
            System.out.println(jucator);
        }
    }
    public static void efectueazaSchimbarea(List<String> jucatori, String jucator_scos, String jucator_introdus){
        jucatori.remove(jucator_scos);
        jucatori.add(jucator_introdus);
    }







}

public class TemaNr2 {
    public static void main(String[] args) {

        // if else care sa afiseze daca un nr e par sau impar
        int nr = 1002;
        if (nr > 8) {
            System.out.println("introduceti un nr mai mic");

        } else if (nr == 2) {
            System.out.println("este numar par");
        } else if (nr == 4) {
            System.out.println("este numar par");
        } else if (nr == 6) {
            System.out.println("este numar par");
        } else if (nr == 8) {
            System.out.println("este numar par");
        } else if (nr == 1) {
            System.out.println("este numar impar");
        } else if (nr == 3) {
            System.out.println("este numar impar");
        } else if (nr == 5) {
            System.out.println("este numar impar");
        } else if (nr == 7) {
            System.out.println("este numar impar");
        }

        if (nr %2 == 0){
            System.out.println("este numar par");
        } else {
            System.out.println("este numar impar");
        }



        // SWITCH Afiseaza numele piesei, pentru valorile de la 1 la 5
        int track = 3;
        switch (track) {
            case 1:
                System.out.println("El Nino - 30 de grame");
                break;
            case 2:
                System.out.println("El Nino feat. Ramona Nerra - Binecuvantat");
                break;
            case 3:
                System.out.println("El Nino - Anii Grei");
                break;
            case 4:
                System.out.println("El Nino feat. Samurai & Karie - Din Rai 2");
                break;
            case 5:
                System.out.println("El Nino - ALIN BAHAOS");
        }
        //DO WHILE:
        //Avand o conditie falsa, verifica daca intr-adevar se executa codul o singura data



        int t = 11;
        do {
            System.out.println(t);
            t++;
        }
        while (t < 10);

        //FOR: dalmatieni numaratoare inversa

        for(int dalmatieni = 101; dalmatieni >0; dalmatieni--) {
            System.out.println("dalmatianul cu numarul: "+ dalmatieni);
        }
        //FOR:
//        Introdu Continue si Break pt Pogo si Perdita (cum am facut la while).
//        cu continue:

        for(int dalmatieni = 1; dalmatieni<=101; dalmatieni++ ){


            if (dalmatieni == 7 || dalmatieni == 9) {

               continue;
            }
            System.out.println("dalmatianul cu numarul: "+ dalmatieni);

             //cu break
        }
        for(int dalmatieni = 1; dalmatieni<=101; dalmatieni++ ) {
            System.out.println("dalmatianul cu numarul: " + dalmatieni);

            if (dalmatieni == 7 || dalmatieni == 9) {
                System.out.println("am gasit dalmatianul adult");
                break;
            }
        }
    }
}








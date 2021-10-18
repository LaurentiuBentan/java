public class IfElse {
    public static void main(String[] args) {
        // if
        int x = 24;
        int y = 20;
        // if simplu, fara else if, fara else
        if (x==y) {
            // daca conditia e adevarata, se executa codul dintre acolade
            // daca nu e adevarata, se ignora blocul de cod dintre {}
            System.out.println("X mai mare!!!!");
            System.out.println("Putem pune oricate linii de cod java");
            if (x==24) {
                System.out.println("Putem pune if in if");
            }
        }


        //if else
        int time = 77;
        if (time < 18) {
            // daca conditia e adevarata, se ajunge aici
            // dar nu se mai intra si pe else
            System.out.println("intra pe if");
        }
        else {
            // daca conditia e falsa, se ajunge aici
            // dar nu se ruleaza codul din if
            System.out.println("intra pe else");
        }

        // else if
        int t = 20;
        // u singur if la inceput
        if (t < 10) {
            System.out.println("Good morning.");
            // putem pune oricate else if-uri dorim
        } else if (t < 20) {
            System.out.println("Good day.");
            // un singue else la final
        } else {
            System.out.println("Good evening.");
        }
        // am terminat cu if-ul, continuam executia codului
        System.out.println("java isi continua executia");



        int age = 18;
        if (age<14 && age>=0){
            System.out.println("Nu are buletin");

        } else if (age>=14 && age<18){
            System.out.println("are buletin dar este minor");

        } else if (age>=18 && age<=110){
            System.out.println("este major");
            System.out.println("are buletin");

        } else {
            System.out.println("te rog introdu un numar pozitiv intre 0 si 110 ");
        }


    }
}

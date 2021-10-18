public class ExercitiiOOP {
    public static void main(String[] args) {
        //un obiect este instanta unei clase
        Car audi = new Car("Audi", 250);
        Car volvo = new Car("Volvo", 230);//volvo este o variabila de tip car


//        audi.accelereaza(-3);
//        audi.vopseste("verde");
//        volvo.vopseste("alb");
//        volvo.accelereaza(70);
//        volvo.stop();
//        audi.descrie();
//        volvo.descrie();
//        audi.setHp(90.5);
//        System.out.println(audi.getHp());

        Angajat george = new Angajat("Prodan", "George", 1000, 5);
        Angajat mihai = new Angajat("Pop", "Mihai", 2000, 2);
        george.functie("Curier");
        mihai.functie("Bucatar");
//        System.out.println(mihai.castigAnual());
//        System.out.println(george.castigAnual());
        george.bonus();
        mihai.bonus();
        mihai.descrie();
        george.descrie();
        System.out.println(george.marireSalariu(1.7));
        System.out.println(mihai.marireSalariu(2.0));

        Date date1 = new Date(1,2,2020);
        Date date2 = new Date(3,7,2008);

        date1.displayDate();
        date2.displayDate();
        date1.setYear(2021);
        System.out.println(date1.getYear());
        date1.displayDate();

    }




}

public class Angajat {
    //Atribute private: nume, prenume, salariu lunar, functie, vechime, bonus

    //Constructor: nume si prenume, salariu lunar, vechime

    //Metode publice: alege functia, return castig anual, void marire salariu(procent),
    //oferire bonus void vechime<3 bonus 300 vechime>3 bonus 500,
    //metoda get bonus care sa returneze bonusul
    //generate getter pentru toate atributele
    //descrie angajat(nume + prenume, functie, vechime, castig total anual(bonus+salariu lunar *12)
    //2 angajati
    //seteaza o functie pentru fiecare
    //la fiecare le aplici o marire de salariu diferita
    //aplici metoda oferire bonus la fiecare
    //descriere pentru fiecare
    //System.out.println("castig total: " + gigel.getBonus() + gigel.salariuAnual());



    private String nume;
    private String prenume;
    private String functie;
    private int salariuLunar;
    private int vechime;
    private int bonus;
    private int castigAnual;
    private int castigTotalAnual;
    private double marireSalariu;

    public Angajat(String nume, String prenume, int salariuLunar, int vechime){
        this.nume = nume;
        this.prenume = prenume;
        this.salariuLunar = salariuLunar;
        this.vechime = vechime;
    }
    public void functie(String functie){
        this.functie = functie;
//        System.out.println("Angajatul "+ prenume+ " are functia: "+functie);
    }
    public int castigAnual() {
        castigAnual = salariuLunar * 12;
        return castigAnual;
    }
    public int castigTotalAnual(){
        castigTotalAnual = castigAnual() + bonus;
        return castigTotalAnual;
    }
    public void bonus(){
        if (vechime<3){
            bonus = 300;
        } else {
            bonus = 500;
        }
        System.out.println(prenume + " " + bonus);
    }
    public void descrie() {

        System.out.println("nume: " + nume);
        System.out.println("prenume: " + prenume);
        System.out.println("functie: " + functie);
        System.out.println("vechime: " + vechime);
        System.out.println("castig total anual: " + castigTotalAnual());
    }

    //marire salariu(procent)


    public double marireSalariu(double marire) {
        marireSalariu = salariuLunar * marire;
        return marireSalariu;
    }
}


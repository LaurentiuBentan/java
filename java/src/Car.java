public class Car {
    // in oop o clasa = definitia unui concept(obiect)
    //Atribute(Fields) care se exprima prin variabile
    private String marca;
    private String culoare = "gri";
    private int viteza = 0;
    private int vitezaMax;
    private boolean esteOprita = true;
    private double hp;

    //constructor: are rolul de a seta valori initiale obligatorii
    public Car(String marca, int vitezaMax){
        this.marca = marca;
        this.vitezaMax = vitezaMax;
    }
    //Actiuni care se exprima prin metode
    public void accelereaza(int viteza){
        System.out.println(marca + ": vroom vroom!!");
        esteOprita = false;
        if (viteza <= vitezaMax && viteza >=0){
            this.viteza = viteza;
        }else if(viteza<0){
            this.viteza = -viteza;
        }else{
            this.viteza = vitezaMax;
        }
    }
    public void stop(){
        esteOprita = true;
        viteza = 0;
        System.out.println(marca + ": STOP!");
    }
    public void afiseazaViteza(){//encapsulation = atribute private si metode care seteaza si returneaza valoarea atributului
        System.out.println(marca + "are viteza " + viteza);
    }
    public void vopseste(String culoare){
        this.culoare = culoare;
        descrie();
    }
    public void descrie(){
        System.out.println("marca: "+marca);
        System.out.println("culoare: "+culoare);
        System.out.println("viteza: "+viteza);
    }
    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}

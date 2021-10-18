import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        // declaram si initializam
                String[] cars = {"Volvo", "BMW", "Ford", "Trabant", "Dacia"};

                // putem suprascrie valorile din sir
                cars[1] = "Opel";

                // aflam dimensiunea sirului
                System.out.println(cars.length); // 5
                // accesam elementele, pornind de la 0
                System.out.println(cars[0].toUpperCase());

                int n = 3;
                int[] age = new int[n]; // declarare
                age[0] = 18; // 0 is the index of the array, 18 is the element it holds
                age[1] = -3; // initializare cu valori
                age[2] = 200;

                System.out.println(age[age.length - 1]);




        //liste
        List<String> shapes = new ArrayList<String>(); // dynamic size!!!
        shapes.add("Cerc"); // String[] shapes1 = {"Cerc}; // distrus // adaugam un element
        shapes.add("Patrat"); // String[] shapes2 = {"Cerc, "Patrat} // distrus
        shapes.add("Triunghi"); // String[] shapes3 = {"Cerc, "Patrat, "Triunghi"}
        System.out.println(shapes.get(2)); // ca si array[2]
        System.out.println(shapes.size()); // dimensiunea listei => 3 (ca si array.length)
        shapes.remove("Cerc"); // stergem un element dupa numele lui
        // shapes.clear(); // sterge toata lista
        System.out.println(shapes.indexOf("Patrat")); // ce index are Patrat? (0 pentru ca am sters Cercul)
        System.out.println(shapes.isEmpty()); // este lista goala?
        shapes.remove(0); // scoatem dupa index

        // lista cu int-uri
        List<Integer> nrs = new ArrayList<Integer>(); // dynamic size!!!
        nrs.add(6);
        nrs.add(4);
        nrs.add(-5);
        Collections.sort(nrs); // sortam lista
        for (Integer nr : nrs) {
            System.out.println(nr);
        }

        /// printam lista cu for each
        for (String shape : shapes) {
            System.out.println(shape);
        }

        // 2d array (matrice, grid)
        int[][] tastaura = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {0}

        };
        for (int[] row : tastaura) { // 1st run:1, 2, 3 | 2nd run: 4, 5, 6
            for (int column : row) {
                System.out.println(column);
            }
        }
    }

}
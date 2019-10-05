package it.fasttrackit;

import java.util.Scanner;

public class Patrulater extends Poligon {

    public double calculPerimetru() {
        System.out.println("Introduceti cele patru laturi ale patrulaterului");
        Scanner in = new Scanner(System.in);
        double latura1 = in.nextDouble();
        double latura2 = in.nextDouble();
        double latura3 = in.nextDouble();
        double latura4 = in.nextDouble();
        if (latura1 == 0 || latura2 == 0 || latura3 == 0 || latura4 == 0) {
            System.out.println("Ati introdus valori incorecte ");
            return 0;
        } else {
            double perim = latura1 + latura2 + latura3 + latura4;
            System.out.println("Perimetrul patrulaterului este " + perim);

            return perim;
        }
    }

    public double calculArie() {
        System.out.println("Aria patrulaterului: calcul prea complicat");
        return 0;
    }

}

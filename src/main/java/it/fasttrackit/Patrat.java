package it.fasttrackit;

import java.util.Scanner;

public class Patrat extends Patrulater {
    private double latura;

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    public Patrat() {
    }

    public double calculPerimetru() {
        System.out.println("Introduceti latura patratuluiu");
        Scanner in = new Scanner(System.in);
        latura = in.nextDouble();
        this.latura = latura;

        if (latura == 0) {
            System.out.println("Ati introdus valori incorecte ");
            return 0;
        } else {
            double perim = latura * 4;
            System.out.println("Perimetrul patratului este " + perim);

            return perim;
        }
    }

    public double calculArie() {
        double arie = latura * latura;
        System.out.println("Aria patratului este " + arie);
        return arie;
    }

    public Patrat(double latura) {

    }

    public double calculPerimetru(double latura) {
        if (latura == 0 ) {
            System.out.println("Ati introdus valori incorecte ");
            return 0;
        } else {
            double perim = latura * 4;
            System.out.println("Perimetrul patratului este " + perim);

            return perim;
        }
    }

    public double calculArie(double latura) {

        double arie = latura*latura;
        System.out.println("Aria patratului este " + arie);
        return arie;
    }
}

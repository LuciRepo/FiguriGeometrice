package it.fasttrackit;

import java.util.Scanner;

public class Dreptunghi extends Patrulater {
   private double laturaMare;
   private double laturaMica;

    public double getLaturaMare() {
        return laturaMare;
    }

    public void setLaturaMare(double laturaMare) {
        this.laturaMare = laturaMare;
    }

    public double getLaturaMica() {
        return laturaMica;
    }

    public void setLaturaMica(double laturaMica) {
        this.laturaMica = laturaMica;
    }

    public Dreptunghi() {
    }

    public double calculPerimetru() {
        System.out.println("Introduceti latura mare si cea mica a dreptunghiului");
        Scanner in = new Scanner(System.in);
        laturaMare = in.nextDouble();
        laturaMica = in.nextDouble();
        this.laturaMare = laturaMare;
        this.laturaMica = laturaMica;

        if (laturaMare == 0 || laturaMica == 0) {
            System.out.println("Ati introdus valori incorecte ");
            return 0;
        } else {
            double perim = (laturaMare + laturaMica) * 2;
            System.out.println("Perimetrul dreptunghiului este " + perim);

            return perim;
        }
    }

    public double calculArie() {
        double arie = laturaMare * laturaMica;
        System.out.println("Aria dreptunghiului este " + arie);
        return arie;
    }

    public Dreptunghi(double laturaMare, double laturaMica) {

    }
    public double calculPerimetru(double laturaMare,double laturaMica){
        if (laturaMare == 0 || laturaMica == 0) {
            System.out.println("Ati introdus valori incorecte ");
            return 0;
        } else {
            double perim = (laturaMare + laturaMica) * 2;
            System.out.println("Perimetrul dreptunghiului este " + perim);

            return perim;
        }
    }
    public double calculArie(double laturaMare, double laturaMica){

        double arie = laturaMare * laturaMica;
        System.out.println("Aria dreptunghiului este " + arie);
        return arie;
    }
}

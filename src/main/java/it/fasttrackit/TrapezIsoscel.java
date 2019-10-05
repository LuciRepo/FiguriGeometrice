package it.fasttrackit;

import java.util.Scanner;

public class TrapezIsoscel extends Patrulater {
    private double laturaMare;
    private double laturaMica;
    private double laturiEgale;

    public double getLaturiEgale() {
        return laturiEgale;
    }

    public void setLaturiEgale(double laturiEgale) {
        this.laturiEgale = laturiEgale;
    }

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

    public TrapezIsoscel() {
    }

    public double calculPerimetru() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti latura mare a trapezului isoscel");
        laturaMare = in.nextDouble();
        System.out.println("Introduceti latura mica a trapezului isoscel");
        laturaMica = in.nextDouble();
        System.out.println("Introduceti dimensiunea laturilor egale a trapezului isoscel");
        laturiEgale=in.nextDouble();
        this.laturaMare = laturaMare;
        this.laturaMica = laturaMica;
        this.laturiEgale=laturiEgale;

        if (laturaMare == 0 || laturaMica == 0 || laturiEgale==0) {
            System.out.println("Ati introdus valori incorecte ");
            return 0;
        } else {
            double perim = (laturaMare + laturaMica+laturiEgale* 2);
            System.out.println("Perimetrul trapezului isoscel este " + perim);

            return perim;
        }
    }

    public double calculArie() {
        double diferenta=(laturaMare-laturaMica)/2;
        double inaltimeLaPatrat=Math.pow(laturiEgale,2)-Math.pow(diferenta,2);
        double inaltime= Math.sqrt(inaltimeLaPatrat);
        double arie = (laturaMare+laturaMica)*inaltime/2;
        System.out.println("Aria trapezului isoscel este " + arie);
        return arie;
    }

    public TrapezIsoscel(double laturaMare, double laturaMica,double laturiEgale) {

    }

    public double calculPerimetru(double laturaMare, double laturaMica,double laturiEgale) {
        if (laturaMare == 0 || laturaMica == 0|| laturiEgale==0) {
            System.out.println("Ati introdus valori incorecte ");
            return 0;
        } else {
            double perim = laturaMare + laturaMica+laturiEgale * 2;
            System.out.println("Perimetrul trapezului isoscel este " + perim);

            return perim;
        }
    }

    public double calculArie(double laturaMare, double laturaMica,double laturiEgale) {

        double arie = ((laturaMare+laturaMica)*Math.sqrt((Math.pow(laturiEgale,2)-Math.pow((laturaMare-laturaMica)/2,2))))/2;
        System.out.println("Aria trapezului isoscel este " + arie);
        return arie;
    }
}

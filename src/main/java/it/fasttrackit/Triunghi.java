package it.fasttrackit;


import java.util.Scanner;

public class Triunghi implements FiguraGeometrica {
    private double[] dimLaturi = new double[3];
    private double[] marimeUnghiuri = new double[3];
    private double perimetru;


    public double getPerimetru() {
        return perimetru;
    }

    public void setPerimetru(double perimetru) {
        this.perimetru = perimetru;
    }

    public double[] getDimLaturi() {
        return dimLaturi;
    }

    public void setDimLaturi(double[] dimLaturi) {
        this.dimLaturi = dimLaturi;
    }

    public double[] getMarimeUnghiuri() {
        return marimeUnghiuri;
    }

    public void setMarimeUnghiuri(double[] marimeUnghiuri) {
        this.marimeUnghiuri = marimeUnghiuri;
    }

    public Triunghi() {
    }


    public double calculPerimetru() {
        System.out.println("Introduceti lungimea laturilor triunghiului ");
        double perimetru = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            dimLaturi[i] = in.nextDouble();
            perimetru += dimLaturi[i];
        }
        System.out.println("Perimetrul triunghiului este " + perimetru);
        this.perimetru = perimetru;
        return perimetru;
    }

    public double calculArie() {
        double semiperimetru = perimetru / 2;
        double arie = Math.sqrt(semiperimetru * (semiperimetru - dimLaturi[0]) * (semiperimetru - dimLaturi[1]) * (semiperimetru - dimLaturi[2]));
        System.out.println("Aria triunghiului este " + arie);
        return arie;
    }
    public Triunghi(double primaLatura, double aDouaLatura, double aTreiaLatura) {}


    public double calculPerimetru ( double primaLatura, double aDouaLatura, double aTreiaLatura){
        perimetru = primaLatura + aDouaLatura + aTreiaLatura;
        System.out.println("Perimetrul triunghiului este " + perimetru);
        this.perimetru = perimetru;
        return perimetru;
    }

    public double calculArie ( double primaLatura, double aDouaLatura, double aTreiaLatura){
        double semiperimetru = perimetru / 2;
        double arie = Math.sqrt(semiperimetru * (semiperimetru - primaLatura) * (semiperimetru - aDouaLatura) * (semiperimetru - aTreiaLatura));
        System.out.println("Aria triunghilui este " + arie);
        return arie;
    }

}

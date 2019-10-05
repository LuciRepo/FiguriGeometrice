package it.fasttrackit;

import java.util.Scanner;

public class Cerc implements FiguraGeometrica {
    private double raza;

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public Cerc() {
    }

    public double calculPerimetru() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti raza cercului");
        double raza = in.nextDouble();
        this.raza = raza;
        double lungimeCerc = 2 * raza * Math.PI;
        System.out.println("Lungimea cercului este " + lungimeCerc);
        return lungimeCerc;
    }

    public double calculArie() {
        double arie = Math.PI * Math.pow(raza, 2);
        System.out.println("Aria cercului este " + arie);
        return arie;
    }

    public Cerc(double raza) {

    }
    public double calculPerimetru(double raza){
        double lungimeCerc=2*raza*Math.PI;
        System.out.println("Lungimea cercului este "+lungimeCerc);
        this.raza=raza;
        return lungimeCerc;
    }
    public double calculArie(double raza){
        double arie=Math.PI*Math.pow(raza,2);
        System.out.println("Aria cercului este "+arie);
        return arie;
    }
}

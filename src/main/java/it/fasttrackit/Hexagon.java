package it.fasttrackit;

import java.util.Scanner;

public class Hexagon extends Poligon {
    private double latura;

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    public Hexagon() {
    }

    public double calculPerimetru() {
        System.out.println("Introduceti lungime laturii hexagonului ");
        Scanner in = new Scanner(System.in);
        latura = in.nextDouble();
        double perim = 6 * latura;
        System.out.println("Perimetrul hexagonului este " + perim);
        return 0;
    }

    public double calculArie() {
        double arie = (3 * Math.pow(latura, 2) * Math.sqrt(3)) / 2;
        System.out.println("Aria hexagonului este " + arie);
        return arie;
    }

    public Hexagon(double latura) {
    }
    public double calculPerimetru(double latura){
        double perim=6*latura;
        System.out.println("Perimetru hexagonului este "+perim);
        return perim;
    }
    public double calculArie(double latura){
        double arie=(3*Math.pow(latura,2)*Math.sqrt(3))/2;
        System.out.println("Aria hexagonului este "+arie);
        return arie;
    }
}

package it.fasttrackit;

import java.util.Scanner;

public class Romb extends Patrulater {
    private double latura;
    private double unghi;


    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    public double getUnghi() {
        return unghi;
    }

    public void setUnghi(double unghi) {
        this.unghi = unghi;
    }

    public Romb() {
    }

    public double calculPerimetru() {
        System.out.println("Introduceti dimensiunea laturii rombului");
        Scanner in = new Scanner(System.in);
        double latura = in.nextDouble();
        System.out.println("Introduceti dimeniunea unuia dintre unghiuri ");
        double unghi = in.nextDouble();
        this.latura = latura;
        this.unghi = unghi;
        if (latura == 0 || unghi == 0 || unghi >= 180) {
            System.out.println("Ati introdus valori gresite ");
            return 0;
        } else {
            double perim = latura * 4;
            System.out.println("Perimetrul rombului este " + perim);
            return perim;
        }
    }

    public double calculArie() {
        double radians = Math.toRadians(unghi);
        double arie = latura * (latura * Math.sin(radians));
        System.out.println("Aria rombului este " + arie);
        return arie;
    }

    public Romb(double latura, double unghi) {
    }
    public double calculPerimetru(double latura, double unghi){
        if (latura == 0 || unghi == 0 || unghi >= 180) {
            System.out.println("Ati introdus valori gresite ");
            return 0;
        } else {
            double perim = latura * 4;
            System.out.println("Perimetrul rombului este " + perim);
            return perim;
        }
    }
    public double calculArie(double latura,double unghi){
        double radians = Math.toRadians(unghi);
        double arie = latura * (latura * Math.sin(radians));
        System.out.println("Aria rombului este " + arie);
        return arie;
    }
}

package it.fasttrackit;

import java.util.ArrayList;

public abstract class Poligon implements FiguraGeometrica {
    private ArrayList<Double> laturi = new ArrayList<Double>();

    public ArrayList<Double> getLaturi() {
        return laturi;
    }

    public void setLaturi(ArrayList<Double> laturi) {
        this.laturi = laturi;
    }

    public double calculPerimetru() {
        double perim = 0;
        for (Double latura : laturi) {
            perim = perim + latura;
        }
        return perim;
    }

    public abstract double calculArie();
}

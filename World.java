package org.example;

import java.util.ArrayList;
import java.util.List;
// class fait pas Nino et Eva
public class World {
    private final int minX;
    private final int maxX;
    private final int minY;
    private final int maxY;
    private final List<Personnage> personnages;
    private final List<Batiment> batiments;
    private final List<Ressource> ressources;

    public World(int minX, int maxX, int minY, int maxY) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.personnages = new ArrayList<>();
        this.batiments = new ArrayList<>();
        this.ressources = new ArrayList<>();
    }

    public static World createWolrd (int minX, int maxX, int minY, int maxY) { // Eva
        if (minX < maxX && minY < maxY) {
            return (new World( minX, maxX, minY, maxY));
        } else {
            return(null);
        }
    }

    public int getMinX() { // Eva
        return minX;
    }
    public int getMaxX() { // Eva
        return maxX;
    }
    public int getMinY() { // Eva
        return minY;
    }
    public int getMaxY() {// Eva
        return maxY;
    }

    public List<Personnage> GetPersonnages (){ // Eva
        return(this.personnages);
    }

    public List<Batiment> Getbatiments (){ // Eva
        return(this.batiments);
    }
    public List<Ressource> Getressources (){ // Eva
        return(this.ressources);
    }

    public boolean caseOcuppe (int x, int y) { // Nino
        for (Personnage v : personnages) {
            if (v.getxPosition() == x && v.getyPosition() == y) {
                return true;
            }
        }
        return false;
    }

    public boolean addPersonnage (Personnage v){ // Nino
        if (caseOcuppe(v.getxPosition(), v.getyPosition())) {
            return false;
        }
        this.Personnage.add(v);
        return true;
    }
}

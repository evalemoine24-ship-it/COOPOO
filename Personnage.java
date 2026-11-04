
Package Viculus;
import java.util.Random;

public class Personnage {
    private String nom;
    private int posX;
    private int posY;
    private int pointsVie;
    private int pointVieMax;
    private typeMetier metier;

    public Personnage(String nom, int posX, int posY, int pointsVie, int pointVieMax, typeMetier metier) {
        this.nom = nom;
        this.posX = posX;
        this.posY = posY;
        this.pointsVie = pointsVie;
        this.pointVieMax = pointVieMax;
        this.metier = metier;
    }

    public String getNom() {
        return nom;
    }

    public int getxPosition() {
        return posX;
    }

    public int getyPosition() {
        return posY;
    }

    public int getPointsVie() {
        return pointsVie;
    }

    public int getPointVieMax() {
        return pointVieMax;
    }

    public void setPointVieMax(int pointVieMax) {
        this.pointVieMax = pointVieMax;
    }

    public typeMetier getMetier() {
        return metier;
    }

    public void setPositionX(int posX) {
        this.posX = posX;
    }

    public void setPositionY(int posY) {
        this.posY = posY;
    }

    public void Move() {
        int randomX = (int) (Math.random() * 3) - 1; // Génère un nombre aléatoire entre -1 et 1
        int randomY = (int) (Math.random() * 3) - 1; // Génère un nombre aléatoire entre -1 et 1
        this.posX += randomX;
        this.posY += randomY;        
    }

   
    }

}
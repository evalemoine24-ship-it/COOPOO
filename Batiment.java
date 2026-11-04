package Viculus;
import java.util.ArrayList;
import java.util.List;

public abstract class Batiment  { // Eva et Nino
    private int positionX;
    private int positionY;
    private int niveau;
    private static int NIVEAUMAX=5;
    private int pvBat;
    private static int MINIPVBOT=0;
    private int maxPvBat;

    public Batiment (int positionX, int positionY, int niveau, int pvBot, int maxPvBot){ //nino
        this.positionX = positionX;
        this.positionY = positionY;
        this.niveau = niveau;
        this.pvBat = pvBot;
        this.maxPvBat = maxPvBot;
    }

    public int GetPositionX() { // Eva 
        return(positionX);
    }

    public int GetPositionY() { // Eva 
        return(positionY);
    }

    public int Getniveau() { // Eva 
        return(niveau);
    }

    public boolean caseOcuppe (int x, int y) { // Nino
        for (positionX v : personnages) {
            if (v.getxPosition() == x && v.getyPosition() == y) {
                return true;
            }
        }
        return false;
    }

}

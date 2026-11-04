package Viculus;
import java.util.ArrayList;
import java.util.List;

public abstract class Batiment  { // Eva et Nino
    private int positionX;
    private int positionY;
    private int niveau;
    private static int NIVEAUMAX=5;
    private int pvBot;
    private static int MINIPVBOT=0;
    private int maxPvBot;

    public Batiment (int positionX, int positionY, int niveau, int pvBot, int maxPvBot){ //nino
        this.positionX = positionX;
        this.positionY = positionY;
        this.niveau = niveau;
        this.pvBot = pvBot;
        this.maxPvBot = maxPvBot;
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

}

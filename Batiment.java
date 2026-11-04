package Viculus;
import java.util.ArrayList;
import java.util.List;

public abstract class Batiment  {
    private int positionX;
    private int positionY;
    private int niveau;
    private static int NIVEAUMAX=5;
    private int pvBot;
    private static int MINIPVBOT=0;
    private int maxPvBot;

    public Batiment (int positionX, int positionY, int niveau, int pvBot, int maxPvBot){
        this.positionX = positionX;
        this.positionY = positionY;
        this.niveau = niveau;
        this.pvBot = pvBot;
        this.maxPvBot = maxPvBot;
    }

    public int GetPositionX() {
        return(positionX);
    }

    public int GetPositionY() {
        return(positionY);
    }

    public int Getniveau() {
        return(niveau);
    }

}

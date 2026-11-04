//fait par Mathias et Lena
public class Ressources {
    private int posX;
    private int posY;
    private double ressourceDispo; //combien de bois je peux récupérer
    private int tempsRecup; //temps avant de réapparaitre
    private TypeRessource typeR;
    public Ressources ( int posX, int posY,double ressourceDispo, int tempsRecup, TypeRessource typeR){
        this.posX=posX;
        this.posY=posY;
        this.ressourceDispo = ressourceDispo;
        this.tempsRecup=tempsRecup;
        this.typeR=typeR;
    }

    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public double getRessourceDispo() {
        return ressourceDispo;
    }
    public TypeRessource getTypeR() {
        return typeR;
    }
    public int getTempsRecup() {
        return tempsRecup;
    }

}

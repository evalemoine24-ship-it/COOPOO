//fait par Mathias et Lena
public class Ressources {
    private int posX;
    private int posY;
    private TypeRessource typeR;
    public Ressources ( int posX, int posY, TypeRessource typeR){
        this.posX=posX;
        this.posY=posY;
        this.typeR=typeR;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public TypeRessource getTypeR() {
        return typeR;
    }

}

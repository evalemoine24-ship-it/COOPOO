//fait par Mathias et Lena
public class Ressource {
    private int posX;
    private int posY;
    private TypeRessource typeR;
    public Ressource ( int posX, int posY, TypeRessource typeR){
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

//fait par Mathias et Lena
public class Ressource {
    private int rPosX;
    private int rPosY;
    private TypeRessource typeR;
    public Ressource ( int posX, int posY, TypeRessource typeR){
        this.rPosX=posX;
        this.rPosY=posY;
        this.typeR=typeR;
    }
    public int getRposX() {
        return rPosX;
    }
    public int getRposY() {
        return rPosY;
    }
    public TypeRessource getTypeR() {
        return typeR;
    }

}

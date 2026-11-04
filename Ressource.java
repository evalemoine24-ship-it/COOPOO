//fait par Mathias et Lena
public class Ressource {
    private int rPosX;
    private int rPosY;
    private TypeRessource typeR;
    public Ressource ( int rPosX, int rPosY, TypeRessource typeR){
        this.rPosX=rPosX;
        this.rPosY=rPosY;
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

import java.util.Random;

public class Personnage {
   private String nom;
   private int pointVie;
   private int pointVieMax=10; 
   private int posX;
   private int posY;
   private TypeMetier metier;
   
   public Personnage(String nom, int pointVie, int posX, int posY, TypeMetier metier) {
       this.nom = nom;
       this.pointVie = pointVieMax;
       this.posX = posX;
       this.posY = posY;
       this.metier = metier;
   }

   public String getNom() {
       return nom;
   }

   public int getPointVie() {
       return pointVie;
   }

   public int getPointVieMax() {
       return pointVieMax;
   }

   public int getPosX()  {
       return posX;
   }

   public int getPosY() {
       return posY;
   }

   public TypeMetier getMetier() {
       return metier;
   }

   public void setPointVie(int pointVie){
      this.pointVie=pointVie;
   }
   public void setPosX(int posX) {
       this.posX = posX;
   }

   public void setPosY(int posY) {
       this.posY = posY;
   }

   public void move(){
      int randomX = (int)(Math.random()*3)-1;
      int randomY = (int)(Math.random()*3)-1;
      this.posX+=randomX;
      this.posY+=randomY;
   }


}

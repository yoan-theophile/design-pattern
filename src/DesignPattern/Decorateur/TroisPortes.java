package DesignPattern.Decorateur;

public class TroisPortes implements Voiture{
  @Override
  public void allumerPhares() {
    System.out.println("J'allume les phares de la TroisPortes.");
    
  }
  
  @Override
  public void arreter() {
    System.out.println("J'arrete la TroisPortes.");
    
  }
  
  @Override
  public void demarrer() {
    System.out.println("Je demarre la TroisPortes.");
    
  }
}

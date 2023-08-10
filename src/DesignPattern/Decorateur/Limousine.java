package DesignPattern.Decorateur;

public class Limousine implements Voiture{
  @Override
  public void allumerPhares() {
    System.out.println("J'allume les phares de la limousine.");
    
  }
  
  @Override
  public void arreter() {
    System.out.println("J'arrete la limousine.");
    
  }
  
  @Override
  public void demarrer() {
    System.out.println("Je demarre la limousine.");
    
  }
}

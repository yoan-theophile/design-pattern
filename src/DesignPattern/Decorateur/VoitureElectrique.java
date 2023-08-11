
package DesignPattern.Decorateur;

public class VoitureElectrique implements Voiture {
    Voiture voitureADecorer;

    public VoitureElectrique(Voiture v) {
        voitureADecorer = v;
    }

    // nouvelle m´ethode -- d´ecoration
    public void chargerVoiture() {
        System.out.println("Je recupere qqs km dautonomie");
    }

    public void demarrer() {
        voitureADecorer.demarrer(); // r´eutilisation
    }

    public void arreter() {
        System.out.println("Arreter voiture electrique");
        voitureADecorer.arreter(); // r´eutilisation
        System.out.println("La voiture electrique est bien arretee");
    }

    public void allumerPhares() {
        voitureADecorer.allumerPhares(); // r´eutilisation
    }
}

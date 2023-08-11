package DesignPattern.Decorateur;

public class Scroll extends Decorateur {
    public Scroll(View v) {
        super(v);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Affichage du scroll");
    }
}
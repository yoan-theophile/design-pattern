package DesignPattern.Decorateur;

public class Bordered extends Decorateur {
    public Bordered(View v) {
        super(v);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Affichage du Bordered");
    }
}
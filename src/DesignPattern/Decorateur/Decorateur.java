package DesignPattern.Decorateur;

public class Decorateur implements View {
    View viewADecorer;

    Decorateur(View v) {
        viewADecorer = v;
    }

    @Override
    public void afficher() {
        viewADecorer.afficher();
    }
}
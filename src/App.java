
// import DesignPattern.Singleton;
// import DesignPattern.Decorateur.Limousine;
// import DesignPattern.Decorateur.TroisPortes;
// import DesignPattern.Decorateur.Voiture;
// import DesignPattern.Strategy.GreenColorStrategy;
// import DesignPattern.Strategy.RedColorStrategy;
// import DesignPattern.Strategy.TextFormatter;

// # Compile Java files
// javac -d bin -cp lib/* src/*.java

interface Voiture {
    public void demarrer();

    public void arreter();

    public void allumerPhares();
}

class TroisPortes implements Voiture {
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

class Limousine implements Voiture {
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

class VoitureElectrique implements Voiture {
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

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("DESIGN PATTERNS\n");
        // testSingleton();
        Voiture limousine = new Limousine();
        Voiture troisPorte = new TroisPortes();
        VoitureElectrique limousineElectrique = new VoitureElectrique(limousine);
        VoitureElectrique troisPorteElectrique = new VoitureElectrique(troisPorte);

        // limousine.demarrer();
        // troisPorte.demarrer();
        System.out.println("--------------------------------------------------------------------------");
        limousineElectrique.demarrer();
        limousineElectrique.chargerVoiture();
        limousineElectrique.arreter();

        System.out.println("--------------------------------------------------------------------------");
        troisPorteElectrique.demarrer();
        troisPorteElectrique.chargerVoiture();
        troisPorteElectrique.arreter();

        // limousine.arreter();
        // troisPorte.arreter();

    }

    // public static void testSingleton() {
    // TextFormatter formatter = new TextFormatter(new RedColorStrategy());
    // Singleton instance1 = Singleton.getObject();
    // Singleton instance2 = Singleton.getObject();
    // boolean sameInstance = instance1 == instance2;

    // formatter.setColorStrategy(sameInstance ? new GreenColorStrategy() : new
    // RedColorStrategy());
    // formatter.format("Les instances sont egales ? " + sameInstance + ".");
    // System.out.println();
    // }
}

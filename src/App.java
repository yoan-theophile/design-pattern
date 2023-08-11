
import DesignPattern.Singleton;
import DesignPattern.Decorateur.Bordered;
import DesignPattern.Decorateur.Decorateur;
import DesignPattern.Decorateur.Limousine;
import DesignPattern.Decorateur.Scroll;
import DesignPattern.Decorateur.TextView;
import DesignPattern.Decorateur.TreeView;
import DesignPattern.Decorateur.TroisPortes;
import DesignPattern.Decorateur.View;
import DesignPattern.Decorateur.Voiture;
import DesignPattern.Decorateur.VoitureElectrique;
import DesignPattern.Strategy.GreenColorStrategy;
import DesignPattern.Strategy.RedColorStrategy;
import DesignPattern.Strategy.TextFormatter;
import DesignPattern.Proxy.CommandExecutorTest;

// # Compile Java files
// javac -d bin -cp lib/* src/*.java src/DesignPattern/Strategy/*.java src/DesignPattern/Decorateur/*.java  src/DesignPattern/*.java

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("DESIGN PATTERNS\n");

        // testSingleton();
        // testDecorateur1();
        // testDecorateur2();
        CommandExecutorTest.test();
    }

    private static void testDecorateur2() {
        System.out.println("---------------------------- TEST DECORATEUR 2 ---------------------------");
        View bonjourTextView = new TextView();
        View familleTreeView = new TreeView();
        Decorateur bonjourTextViewBordered = new Bordered(bonjourTextView);
        Decorateur bonjourTextViewScrollBordered = new Scroll(bonjourTextViewBordered);
        
        System.out.println("--------------------------------------------------------------------------");
        familleTreeView.afficher();

        System.out.println("--------------------------------------------------------------------------");
        bonjourTextViewScrollBordered.afficher();
    }

    private static void testDecorateur1() {
        System.out.println("---------------------------- TEST DECORATEUR 1 ---------------------------");
        Voiture limousine = new Limousine();
        Voiture troisPorte = new TroisPortes();
        VoitureElectrique limousineElectrique = new VoitureElectrique(limousine);
        VoitureElectrique troisPorteElectrique = new VoitureElectrique(troisPorte);

        limousine.demarrer();
        troisPorte.demarrer();
        System.out.println("--------------------------------------------------------------------------");
        limousineElectrique.demarrer();
        limousineElectrique.chargerVoiture();
        limousineElectrique.arreter();

        System.out.println("--------------------------------------------------------------------------");
        troisPorteElectrique.demarrer();
        troisPorteElectrique.chargerVoiture();
        troisPorteElectrique.arreter();

        limousine.arreter();
        troisPorte.arreter();
    }

    public static void testSingleton() {
    TextFormatter formatter = new TextFormatter(new RedColorStrategy());
    Singleton instance1 = Singleton.getObject();
    Singleton instance2 = Singleton.getObject();
    boolean sameInstance = instance1 == instance2;

    formatter.setColorStrategy(sameInstance ? new GreenColorStrategy() : new
    RedColorStrategy());
    formatter.format("Les instances sont egales ? " + sameInstance + ".");
    System.out.println();
    }
}

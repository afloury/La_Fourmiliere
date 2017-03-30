import Utils.Log;
import Classe.Chief;
import Classe.Queen;
import Classe.Soldier;
import Utils.Utils;

import java.util.logging.Logger;

/**
 * Created by nani on 27/03/2017.
 */
public class Main {

    private static final Logger Toto = Logger.getLogger( Main.class.getName() );

    public static void main(String[] args) {

        Log.i(Main.class, "salut");

        Log.i(Main.class, Utils.getRandomFood().toString());

        Chief chef = new Chief(0);
        Soldier soldat=new Soldier(0, chef);
        Queen queen = new Queen(0);

        // Add an observer
        soldat.addObserver(chef);
        queen.addObserver(soldat);
        queen.addObserver(chef);

        queen.sendPheromone();

        Log.s(Main.class, "blah !!!");

        // Change soldier state
        soldat.setAlive(false);

    }

    public void god() {
        Queen queen = new Queen(0);
        queen.hatch();
        queen.anthill(3);
    }
}

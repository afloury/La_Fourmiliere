package Classe;
import Utils.*;

/**
 * Created by nani on 27/03/2017.
 */
public class Queen extends BaseAnt {

    private int nbAntByChief = 100;

    public Queen(int id) {
        super(id);
    }

    public void hatch() {
        setAlive(true);
    }

    public void anthill(int chiefs) {

        int indexSoldat = 0;
        int indexChief = 0;
        Log.i(Queen.class, "Création de la fourmilière avec "+chiefs+" Chefs");

        for (int i = 0; i < chiefs; i++) {
            Chief chief = new Chief(indexChief);
            chief.hatch(nbAntByChief);
            indexChief++;
            for (int j = 0; j < nbAntByChief; j++) {
                Soldier soldat = new Soldier(indexSoldat, chief);
                indexSoldat++;
            }
        }
    }

    public void sendPheromone() {
        setChanged();
        notifyObservers();
    }
}

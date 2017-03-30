package Classe;
import Utils.*;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by nani on 27/03/2017.
 */
public class Soldier extends BaseAnt implements Observer {


    private Chief chief;

    public Soldier(int id, Chief chief) {
        super(id);
        this.chief = chief;
    }

    public void update(Observable obs, Object obj) {
        if (obs instanceof Queen) {
            int lifetime = Utils.getRandomLifeTime(getRandMin(), getRandMax());
            hatch(lifetime);
            Log.i(Soldier.class, "La fourmis soldat : "+getId()+" éclos avec "+ getLifetime()+" point de vie !");
        }
    }

    public Chief getChief() {
        return chief;
    }

    public void setChief(Chief chief) {
        this.chief = chief;
    }
}

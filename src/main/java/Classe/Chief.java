package Classe;

import java.util.*;
import Utils.*;

/**
 * Created by nani on 27/03/2017.
 */
public class Chief extends BaseAnt implements Observer {

    // Update chief infos when recieve notif
    public void update(Observable obs, Object obj) {
        if(obs instanceof Queen) {
            hatch(getRandMax());
            Log.i(Chief.class,"La fourmis chef : " + getId() + " éclos avec " + getLifetime() + " point de vie !");
        } else if(obs instanceof Soldier) {
            Log.i(Chief.class, "le soldat est mort");
        }
    }

    public Chief(int id) {
        super(id);
    }

    public String toString(){
        return "Chef id = "+getId();
    }

}

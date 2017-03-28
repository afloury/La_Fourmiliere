import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by nani on 27/03/2017.
 */
public class BaseAnt extends Observable {

    private int id;
    private boolean alive;
    private int lifetime;
    private Point position;

    private int randMin = 10;
    private int randMax = 20;

    public BaseAnt(int id) {
        this.id = id;
        this.alive = false;
    }

    // hatch the ant
    public void hatch(int lifetime) {
        this.alive = true;
        this.lifetime = lifetime;
    }

    // Change the state of ant notifie the observer
    public void setAlive(boolean alive) {
        this.alive=alive;
        if (alive == false) {
            setChanged();
            notifyObservers(this.id);
        }
    }

    public boolean isAlive(){ return alive;}

    public int getLifetime() {
        return lifetime;
    }

    public void looseLifePoint() {
        this.lifetime--;
        if(this.lifetime < 1){
            setAlive(false);
            System.out.println("la fourmis est morte !"+lifetime);
        }
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "fourmis (id="+id+" etat="+alive+")";
    }

    public int getRandMin() {
        return randMin;
    }

    public int getRandMax() {
        return randMax;
    }
}

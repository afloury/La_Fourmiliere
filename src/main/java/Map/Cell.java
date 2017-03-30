package Map;

import Utils.Utils;
import Enum.*;

import java.util.ArrayList;

/**
 * Created by nani on 30/03/2017.
 */
public class Cell {

    //private ArrayList<FoodType> foods = new ArrayList<FoodType>();
    private ArrayList<Pheromone> pheromones = new ArrayList<Pheromone>();
    private ArrayList<OtherRessources> otherRessources = new ArrayList<OtherRessources>();

    public Cell() {

    }

    public Cell(/*ArrayList<FoodType> foods, */ArrayList<Pheromone> pheromones, ArrayList<OtherRessources> otherRessources) {
        //this.foods = foods;
        this.pheromones = pheromones;
        this.otherRessources = otherRessources;
    }

    public void generateRessources() {
    }
}

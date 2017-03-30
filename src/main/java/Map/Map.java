package Map;

import java.util.ArrayList;

/**
 * Created by nani on 29/03/2017.
 */
public class Map {

    private int width = 10;
    private int height = 10;
    //private ArrayList<MapRessource> ressources = new ArrayList<MapRessource>();

    //private MapRessource[][][] cells = new MapRessource[width][height][];
    private Cell[][] cells = new Cell[width][height];


    public void initMap() {
        for (int i=0; i<width; i++) {
            for (int j=0; j<height; j++) {
                this.cells[i][j] = new Cell();
            }
        }
    }
}

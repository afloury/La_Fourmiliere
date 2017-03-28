/**
 * Created by nani on 27/03/2017.
 */
public class main {

    public static void main(String[] args) {

        System.out.println(100%3);
        // Define a chief
        Chief chef = new Chief(0);

        // Define a soldier
        Soldier soldat=new Soldier(0, chef);

        Queen queen = new Queen(0);

        soldat.hatch(5);
        chef.hatch(5);


        // Add an observer
        soldat.addObserver(chef);
        queen.addObserver(soldat);

        queen.sendPheromone();

        //System.out.println("Avant mise à jour de l'etat du chef:\tChef: "+ chef);
        // Change soldier state
        soldat.setAlive(false);
        System.out.println("Chef: "+ chef);
    }

    public void god() {
        Queen queen = new Queen(0);
        queen.hatch();
        queen.anthill(3);
    }
}

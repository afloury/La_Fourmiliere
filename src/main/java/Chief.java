import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by nani on 27/03/2017.
 */
public class Chief extends BaseAnt implements Observer {

    // Update chief infos when recieve notif
    public void update(Observable obs, Object obj) {
        if(obs instanceof BaseAnt){
            /*Calendar calendar=new GregorianCalendar(Locale.FRANCE);
            Date date=calendar.getTime();*/
            System.out.println("la fourmis "+obj+" est morte !");
        }
    }

    public Chief(int id) {
        super(id);
    }

    public String toString(){
        return "Chef id = "+getId();
    }

}

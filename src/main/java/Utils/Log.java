package Utils; /**
 * Created by nani on 29/03/2017.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class Log {

    private static final Logger Log = Logger.getLogger( Log.class.getName() );

    public static void i(Class context, String value) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date)+" ~ "+context.getName()+" : ♥ "+value);
    }

    public static void s(Class context, String value) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date)+" ~ "+context.getName()+" : █ "+value);
    }
}

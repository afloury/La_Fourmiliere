import java.util.Random;

/**
 * Created by nani on 27/03/2017.
 */
public class Utils {

    public static int getRandomLifeTime(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        return randomNumber;
    }
}

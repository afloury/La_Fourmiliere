package Utils;

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

    public static Enum.FoodType getRandomFood() {
        Random random = new Random();
        int randomNumber = random.nextInt(Enum.FoodType.values().length);
        return Enum.FoodType.values()[randomNumber];
        //return FoodType.BREAD;
    }
}

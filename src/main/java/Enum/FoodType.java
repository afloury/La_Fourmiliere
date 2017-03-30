package Enum;

/**
 * Created by nani on 30/03/2017.
 */
public enum FoodType {

    BREAD("pain"),
    STEAK("steak"),
    RASPBERRY("framboise");


    private final String text;

    FoodType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

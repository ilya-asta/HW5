package Model;

public class HotDrinkInTemperature extends HotDrink{
    private int temperature;

    public HotDrinkInTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

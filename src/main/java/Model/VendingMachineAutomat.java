package Model;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineAutomat implements VendingMashine{
    private List<HotDrink> drinks;

    public VendingMachineAutomat() {
        drinks = new ArrayList<>();
        drinks.add(new HotDrink("Tea", 200));
        drinks.add(new HotDrinkInTemperature("Tea", 200, 75));
        drinks.add(new HotDrinkInTemperature("Tea", 200, 75));

    }
    public HotDrink getProduct(String name, int volume){
        for (HotDrink hotDrink : drinks) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume){
                return hotDrink;
            }
            
        }

        return null;
    }
}

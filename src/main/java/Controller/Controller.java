package Controller;

import Model.HotDrink;
import Model.HotDrinkInTemperature;
import Model.VendingMashine;

public class Controller {
    private VendingMashine mashine;

    public Controller(VendingMashine mashine) {
        this.mashine = mashine;
    }

    public void sellDrink(String name, int volume){
        HotDrink hotDrink = mashine.getProduct(name, volume);
        if (hotDrink != null){
            System.out.println("Продан напиток " + hotDrink.getName() + "Объем " + hotDrink.getVolume());
            if  (hotDrink instanceof HotDrinkInTemperature){
                HotDrinkInTemperature hotDrinkInTemperature = (HotDrinkInTemperature) hotDrink;
                System.out.println("Температура" + hotDrinkInTemperature.getTemperature());
            }
        }else {
            System.out.println("Напиток не найден");
        }
    }
}

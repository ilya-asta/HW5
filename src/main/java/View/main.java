package View;

import Controller.Controller;
import Model.VendingMachineAutomat;
import Model.VendingMashine;

public class main {
    public static void main(String[] args) {

        VendingMashine mashine = new VendingMachineAutomat();
        Controller controller = new Controller(mashine);
        controller.sellDrink("Tea", 200);
        controller.sellDrink("Tea", 150);
        controller.sellDrink("Cacao", 250);
        controller.sellDrink("Coffee", 300);

    }
}

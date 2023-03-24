import inventoryManager.Brand;
import inventoryManager.Inventory;
import inventoryManager.Mouse;
import inventoryManager.Screen;

public class Main {
    public static void main(String[] args) {
        Mouse dellMouse = new Mouse(Brand.DELL, 20.0);
        Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x1080");

        Inventory inventory = new Inventory();

        inventory.addItem(dellMouse, 12);
        inventory.addItem(samsungScreen, 5);

        inventory.removeItem(dellMouse, 16);

        inventory.displayInventoryOnConsole();

        inventory.displayItemOnConsole();
    }
}

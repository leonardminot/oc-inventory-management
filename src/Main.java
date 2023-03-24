import inventoryManager.Brand;
import inventoryManager.Mouse;
import inventoryManager.Screen;

public class Main {
    public static void main(String[] args) {
        Mouse dellMouse = new Mouse(Brand.DELL, 20.0);
        Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x1080");

        System.out.println(samsungScreen);
        System.out.println(dellMouse);
    }
}

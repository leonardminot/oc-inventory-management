package inventoryManager;

public class Mouse extends Item {
    public Mouse(Brand brand, double price) {
        super(brand, price);
    }

    @Override
    public String toString() {
        return "MOUSE - " + super.toString();
    }
}

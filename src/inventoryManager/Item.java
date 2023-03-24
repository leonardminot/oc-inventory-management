package inventoryManager;

public abstract class Item {
    protected Brand brand;
    protected double price;

    public Item(Brand brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}

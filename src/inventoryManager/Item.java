package inventoryManager;

public abstract class Item {
    protected Brand brand;

    protected double price;
    public Item(Brand brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : " + this.brand + " / Price : " + this.price;
    }
}

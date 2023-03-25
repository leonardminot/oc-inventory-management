package inventoryManager;

public class Screen extends Item {
    protected String resolution;

    public Screen(Brand brand, double price, String resolution) {
        super(brand, price);
        this.resolution = resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "SCREEN - " + super.toString() + " / resolution : " + this.resolution;
    }
}

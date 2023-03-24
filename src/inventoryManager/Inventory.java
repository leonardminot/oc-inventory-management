package inventoryManager;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Item, Integer> store;

    public Inventory() {
        this.store = new HashMap<Item, Integer>();
    }

    public void addItem(Item itemToAdd, int quantity) {
        this.store.put(itemToAdd, quantity);
    }

    public void removeItem(Item itemToRemove, int quantityToRemove) {
        int quantityLeft = getQuantityLeft(this.store.get(itemToRemove), quantityToRemove);
        this.store.put(itemToRemove, quantityLeft);
    }

    private int getQuantityLeft(int quantityInStock, int quantityToRemove) {
        int quantityLeft = quantityInStock - quantityToRemove;
        if (quantityLeft < 0) { quantityLeft = 0; }

        return quantityLeft;
    }

    public void displayInventoryOnConsole() {
        for (Map.Entry<Item, Integer> itemInStore : this.store.entrySet()) {
            System.out.println(itemInStore.getKey() + " - In stock : " + itemInStore.getValue());
        }
    }

    public void displayItemOnConsole() {
        for (Map.Entry<Item, Integer> itemInStore : this.store.entrySet()) {
            System.out.println(itemInStore.getKey());
        }
    }
}

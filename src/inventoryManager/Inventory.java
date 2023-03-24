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
        int remainingStock = this.store.get(itemToRemove);
        int quantityLeft = remainingStock - quantityToRemove;

        if (remainingStock - quantityToRemove < 0) {
            quantityLeft = 0;
        }

        this.store.put(itemToRemove, quantityLeft);
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

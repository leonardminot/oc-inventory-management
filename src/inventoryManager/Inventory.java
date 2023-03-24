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

    public void displayInventoryOnConsole() {
        for (Map.Entry<Item, Integer> itemInStore : store.entrySet()) {
            System.out.println(itemInStore.getKey() + " - In stock : " + itemInStore.getValue());
        }
    }
}

package inventoryManager;

import java.util.Map;

public class Inventory {
    private Map<Item, Integer> store;

    public void addItem(Item itemToAdd, int quantity) {
        this.store.put(itemToAdd, quantity);
    }
}

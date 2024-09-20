import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(String item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(String item, int quantity) {
        if (items.containsKey(item) && items.get(item) >= quantity) {
            items.put(item, items.get(item) - quantity);
        } else {
            System.out.println("Item não disponível ou quantidade insuficiente.");
        }
    }

    public void displayInventory() {
        System.out.println("Inventário:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

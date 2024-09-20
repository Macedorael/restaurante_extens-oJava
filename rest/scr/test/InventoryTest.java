import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {
    @Test
    public void testAddItem() {
        Inventory inventory = new Inventory();
        inventory.addItem("Arroz", 100);
        assertEquals(100, inventory.getItemQuantity("Arroz"));
    }

    @Test
    public void testRemoveItem() {
        Inventory inventory = new Inventory();
        inventory.addItem("Arroz", 100);
        inventory.removeItem("Arroz", 50);
        assertEquals(50, inventory.getItemQuantity("Arroz"));
    }
}

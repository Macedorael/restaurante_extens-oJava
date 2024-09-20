public class InventoryUpdateThread extends Thread {
    private Inventory inventory;
    private String item;
    private int quantity;

    public InventoryUpdateThread(Inventory inventory, String item, int quantity) {
        this.inventory = inventory;
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        inventory.addItem(item, quantity);
        System.out.println("Item adicionado ao inventário por " + Thread.currentThread().getName());
    }
}
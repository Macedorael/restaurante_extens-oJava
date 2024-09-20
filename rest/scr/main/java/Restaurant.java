public class Restaurant {
    private Inventory inventory;
    private Transaction transaction;
    private DataAnalyzer dataAnalyzer;

    public Restaurant() {
        inventory = new Inventory();
        transaction = new Transaction();
        dataAnalyzer = new DataAnalyzer();
    }

    public void start() {
        System.out.println("Restaurante comunitário iniciado.");
        // Aqui você pode adicionar a lógica para gerenciar o restaurante
    }
}

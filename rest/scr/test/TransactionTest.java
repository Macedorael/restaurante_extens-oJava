import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {
    @Test
    public void testAddTransaction() {
        Transaction transaction = new Transaction();
        transaction.addTransaction("Compra de Arroz - 100 unidades");
        assertEquals(1, transaction.getTransactions().size());
    }
}

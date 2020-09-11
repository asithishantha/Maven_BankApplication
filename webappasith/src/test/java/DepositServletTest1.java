import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositServletTest1 {
    @Test
    public void test() {
        // created an object from DepositServlet class to access deposit method
        DepositServlet dd = new DepositServlet();

        double bal;
        // hard code the bank amount and the amount wish to deposited to the bank
        bal = dd.deposit(5000, 35000);
        assertEquals(40000, bal);

    }
}
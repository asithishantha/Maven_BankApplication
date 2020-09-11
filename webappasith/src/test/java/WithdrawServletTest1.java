import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithdrawServletTest1 {
// created a object from WithDrawedServlet class
    @Test
    public void test() {
        WithdrawServlet dd = new WithdrawServlet();


        double bal;
        // hard code the bank amount and the amount wish to withdrawed from the bank
        bal = dd.withdraw(35000, 5000);
        assertEquals(30000, bal);
// assertion method , which used to compare two values.
    }

}
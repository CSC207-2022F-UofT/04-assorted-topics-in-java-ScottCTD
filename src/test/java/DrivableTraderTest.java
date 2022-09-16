import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrivableTraderTest {
    DrivableTrader dt;

    @Before
    public void setUp() throws Exception {
        dt = new DrivableTrader(10);
    }

    @Test(timeout = 50)
    public void TestGetSellingPrice() {
        Horse h = new Horse();
        Unicorn u = new Unicorn();
        assertEquals(11, dt.getSellingPrice(h));
        assertEquals(Tradable.MISSING_PRICE, dt.getSellingPrice(u));
    }

    @Test(timeout = 50)
    public void TestGetSellingPriceVaryingSpeed() {
        Horse h = new Horse();
        h.upgradeSpeed();
        assertEquals(12, dt.getSellingPrice(h));
    }
}

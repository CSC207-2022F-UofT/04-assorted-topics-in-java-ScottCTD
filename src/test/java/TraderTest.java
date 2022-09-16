/*
 * This file contains JUnit test cases for Trader.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class TraderTest {
    Trader<Drivable> trader;

    @Before
    public void setUp() {
        trader = new Trader<>(10);
    }

    @Test(timeout = 50)
    public void TestEmptyConstructor() {
        assertEquals(0, trader.getInventory().size());
        assertEquals(0, trader.getWishlist().size());
    }


    @Test(timeout = 50)
    public void TestAddToWishlist() {
        trader.addToWishlist(new Horse());
        assertEquals(1, trader.getWishlist().size());
    }

    @Test(timeout = 50)
    public void TestGetSellingPrice() {
        Horse h = new Horse();
        Unicorn u = new Unicorn();
        assertEquals(10, trader.getSellingPrice(h));
        assertEquals(Tradable.MISSING_PRICE, trader.getSellingPrice(u));
    }
}
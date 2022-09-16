import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class DrivableMapTest {
    DrivableMap dm;

    @Before
    public void setUp() {
        dm = new DrivableMap();
    }

    @Test(timeout = 50)
    public void testAddDrivable() {
        Horse h = new Horse();
        assertTrue(dm.addDrivable("Name", h));
        assertFalse(dm.addDrivable("Name", h));
        assertTrue(dm.addDrivable("Name2", h));
    }

    @Test(timeout = 50)
    public void testHasFasterThan() {
        Horse h = new Horse();
        dm.addDrivable("Name", h);
        assertFalse(dm.hasFasterThan(2));
        assertTrue(dm.hasFasterThan(1));
    }

    @Test(timeout = 50)
    public void testGetTradable() {
        Horse h = new Horse();
        Unicorn u = new Unicorn();
        dm.addDrivable("Horse", h);
        dm.addDrivable("Unicorn", u);

        List<Tradable> tradables = dm.getTradable();
        assertEquals(1, tradables.size());
        assertEquals(h, tradables.get(0));
    }
}

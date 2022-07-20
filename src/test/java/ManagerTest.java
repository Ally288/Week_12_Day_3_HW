import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Mary Jane", "ACC", 5000.00, "Marketing");
    }

    @Test
    public void hasName() {
        assertEquals("Mary Jane", manager.getName());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(5500.00, manager.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(50.00, manager.payBonus(),0.00);
    }

}

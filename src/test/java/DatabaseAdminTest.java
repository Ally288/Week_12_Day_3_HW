import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Matt","111",30000);
    }

    @Test
    public void hasName() {
        assertEquals("Matt", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("111", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, databaseAdmin.getSalary(), 0.00);
    }
}

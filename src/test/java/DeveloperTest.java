import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Cody","123",40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Cody", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("123", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, developer.getSalary(),0.00);
    }



}

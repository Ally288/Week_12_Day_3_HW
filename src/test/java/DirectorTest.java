import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Michael","BOSS",100000, 1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Michael", director.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, director.getSalary(), 0.00);
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000, director.getBudget(),0.00);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(100, director.payBonus(), 0.00);
    }


}


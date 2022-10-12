import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Joe", "JL2797394C", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JL2797394C", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, developer.getSalary());
    }

    @Test
    public void canRaiseSalaryIfRaiseIsPositive(){
        assertEquals(41000, developer.raiseSalary(1000), 0.0);
    }

    @Test
    public void cannotApplyNegativeSalaryRaise(){
        assertEquals(40000, developer.raiseSalary(-1000), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, developer.payBonus(), 0.0);
    }

    @Test
    public void canChangeEmployeeName(){
        developer.setName("Joseph");
        assertEquals("Joseph",developer.getName());
    }
}

import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Sarah", "JL3743927C", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Sarah", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JL3743927C", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalaryIfRaiseIsPositive(){
        assertEquals(35000, databaseAdmin.raiseSalary(5000), 0.0);
    }

    @Test
    public void cannotApplyNegativeSalaryRaise(){
        assertEquals(30000, databaseAdmin.raiseSalary(-5000), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.0);
    }

    @Test
    public void canChangeEmployeeName(){
        databaseAdmin.setName("Saz");
        assertEquals("Saz",databaseAdmin.getName());
    }
}

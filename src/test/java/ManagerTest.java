import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Katie", "JL438324C", 60000, "IT");
    }

    @Test
    public void hasName(){
        assertEquals("Katie", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JL438324C", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("IT", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(61000, manager.raiseSalary(1000), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600, manager.payBonus(), 0.0);
    }
}

import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Kirsty", "JL823974C", 80000, "Finance", 1000000);
    }

    @Test
    public void hasName(){
        assertEquals("Kirsty", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JL823974C", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", director.getDepartmentName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0.0);
    }

    @Test
    public void canRaiseSalaryIfRaiseIsPositive(){
        assertEquals(82000, director.raiseSalary(2000), 0.0);
    }

    @Test
    public void cannotApplyNegativeSalaryRaise(){
        assertEquals(80000, director.raiseSalary(-2000), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1600, director.payBonus(), 0.0);
    }

    @Test
    public void canChangeEmployeeName(){
        director.setName("Katherine");
        assertEquals("Katherine",director.getName());
    }

}

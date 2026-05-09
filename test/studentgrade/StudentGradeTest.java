package studentgrade;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeTest {

    @Test
    public void testGetGrade95() {

        int mark = 95;
        String expResult = "A";

        String result = StudentGrade.getGrade(mark);

        assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade85() {

        int mark = 85;
        String expResult = "B";

        String result = StudentGrade.getGrade(mark);

        assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade75() {

        int mark = 75;
        String expResult = "F";

        String result = StudentGrade.getGrade(mark);

        assertEquals(expResult, result);
    }
}

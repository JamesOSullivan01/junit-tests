import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student(1, "John Doe");
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetGrades() {
        assertNotNull(student.getGrades());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade() {
    student.addGrade(100);
    assertEquals(1, student.getGrades().size());
}

    @Test
    public void testGetGradeAverage(){
        student.addGrade(100);
        student.addGrade(95);
        student.addGrade(90);
        assertEquals(95.0, student.getGradeAverage(), 0);
    }


}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private Student student;

    @BeforeEach
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


}
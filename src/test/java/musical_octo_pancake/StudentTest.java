package musical_octo_pancake;

import static org.junit.jupiter.api.Assertions.*;

import musical_octo_pancake.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student mockStudent;

    @BeforeEach
    public void init(){
       mockStudent = new Student();
       mockStudent.setName("Josh");
       mockStudent.setDob(new DateTime(1998, 12, 26, 0, 0));
       mockStudent.setNow(new DateTime(2020, 1, 30, 0, 0));
    }

    @Test
    public void studentGetUsername() {
        assertNotNull(mockStudent.getUsername());
        assertEquals("Josh21", mockStudent.getUsername());
    }

    @Test
    public void studentGetAge() {
        assertNotNull(mockStudent.getAge());
        assertEquals(21 ,mockStudent.getAge());
    }

    @Test
    public void studentSetDobString() {
        mockStudent.setDob("26/12/1997");
        assertNotNull(mockStudent.getAge());
        assertEquals(22, mockStudent.getAge());
    }

    @Test
    public void studentGetId() {
        int low = 1111111;
        int high = 9999999;
        assertNotNull(mockStudent.getId());
        assertTrue( high >= mockStudent.getId(), "Error, id is too high");
        assertTrue(low  <= mockStudent.getId(), "Error, id is too low");
    }
}
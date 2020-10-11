package musical_octo_pancake;

import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.DateTime;
import org.joda.time.Years;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student mockStudent;
    private DateTime dob;

    @BeforeEach
    public void init(){
       mockStudent = new Student();
       mockStudent.setName("Josh");
       dob = new DateTime(1998, 12, 26, 0, 0);
       mockStudent.setDob(dob);
    }

    @Test
    public void studentGetUsername() {
        assertNotNull(mockStudent.getUsername());
        assertEquals("Josh21", mockStudent.getUsername());
    }

    @Test
    public void studentGetAge() {
        assertNotNull(mockStudent.getAge());
        assertEquals(Years.yearsBetween(dob, DateTime.now()).getYears() ,mockStudent.getAge());
    }

    @Test
    public void studentSetDobString() {
        mockStudent.setDob("26/12/1997");
        DateTime dob2 = new DateTime(1997, 12, 26, 0, 0);
        assertNotNull(mockStudent.getAge());
        assertEquals(Years.yearsBetween(dob2, DateTime.now()).getYears(), mockStudent.getAge());
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

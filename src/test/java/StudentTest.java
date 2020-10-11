import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student mockStudent;

    @BeforeEach
    public void init(){
       mockStudent = new Student();
       mockStudent.setName("Josh");
       mockStudent.setDob(new DateTime(1998, 12, 26, 12, 0, 0, 0));
       mockStudent.setNow(new DateTime(2020, 1, 30, 12, 0 ,0 ,0));
    }

    @Test
    public void studentGetUsername() {
        assertEquals("Josh21", mockStudent.getUsername());
    }

    @Test
    public void studentGetAge() {
        assertEquals(21 ,mockStudent.getAge());
    }
}
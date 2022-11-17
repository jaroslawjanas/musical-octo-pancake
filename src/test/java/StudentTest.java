import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private final Student mockStudent = new Student();

    StudentTest () {
        mockStudent.setName("Josh");
        mockStudent.setAge(21);
    }

    @Test
    public void studentGetUsername() {
        assertEquals("Josh21", mockStudent.getUsername());
    }
}
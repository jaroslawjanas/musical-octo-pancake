package musical_octo_pancake;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseTest {

    private Course mockCourse;

    @BeforeEach
    public void init() {
        mockCourse = new Course("Campieter Sciunce");
        mockCourse.setStarDate(DateTime.now().minusYears(2));
        mockCourse.setEndDate(DateTime.now().plusYears(2));
    }

    @Test
    public void courseDuration() {
        assertEquals(4, mockCourse.duration());
    }

    @Test
    public void courseAddRemoveModule() {
        Module mockModule = new Module("Test Module 1233", "Test");
        String mockModuleName = mockModule.getName();

        mockCourse.addModule(mockModule);

        assertEquals(1, mockCourse.getModules().size());
        assertEquals(mockModuleName, mockCourse.getModules().get(0).getName());

        mockCourse.removeModule(mockModule);
        assertEquals(0, mockCourse.getModules().size());
    }

    @Test
    public void courseSetDatesString() {
        mockCourse.setStarDate("22/01/1995");
        mockCourse.setEndDate("23/01/1997");
        assertEquals(2, mockCourse.duration());
    }
}

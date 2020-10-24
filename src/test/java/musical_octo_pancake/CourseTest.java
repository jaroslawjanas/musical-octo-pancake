package musical_octo_pancake;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseTest {

    private Course mockCourse;
    private Module mockModule;
    private Student mockStudent;

    @BeforeEach
    public void init() {
        mockCourse = new Course("Campieter Sciunce");
        mockCourse.setStarDate(DateTime.now().minusYears(2));
        mockCourse.setEndDate(DateTime.now().plusYears(2));

        mockModule = new Module("Test Module 1233", "Test");

        mockStudent = new Student("Josh", "26/01/1998");
    }

    @Test
    public void courseDuration() {
        assertEquals(4, mockCourse.duration());
    }

    @Test
    public void courseAddRemoveModule() {
        mockCourse.addModule(mockModule);

        assertEquals(1, mockCourse.getModules().size());
        assertEquals(mockModule.getName(), mockCourse.getModules().get(0).getName());

        assertEquals(1, mockModule.getCourses().size());
        assertEquals(mockCourse.getName(), mockModule.getCourses().get(0).getName());

        mockCourse.removeModule(mockModule);
        assertEquals(0, mockCourse.getModules().size());
        assertEquals(0, mockModule.getCourses().size());
    }

    @Test
    public void courseAddRemoveModuleWithStudent() {
        mockModule.addStudent(mockStudent);

        mockCourse.addModule(mockModule);

        assertEquals(1, mockCourse.getStudents().size());
        assertEquals(1, mockStudent.getCourses().size());
        assertEquals(mockCourse.getName(), mockStudent.getCourses().get(0).getName());

        mockCourse.removeModule(mockModule);

        assertEquals(0, mockStudent.getCourses().size());
    }

    @Test
    public void courseSetDatesString() {
        mockCourse.setStarDate("22/01/1995");
        mockCourse.setEndDate("23/01/1997");
        assertEquals(2, mockCourse.duration());
    }

}

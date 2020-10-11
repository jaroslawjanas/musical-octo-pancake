package musical_octo_pancake;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModuleTest {
    private Module mockModule;

    @BeforeEach
    public void init() {
        mockModule = new Module();
        mockModule.setName("Saftware Ranginering");
        mockModule.setId("SERG-01");
    }

    @Test
    public void moduleAddRemoveStudent() {
        Student mockStudent = new Student();
        int mockStudentId = mockStudent.getId();

        mockModule.addStudent(mockStudent);

        assertEquals(1, mockModule.getStudents().size());
        assertEquals(mockStudentId, mockModule.getStudents().get(0).getId());

        mockModule.removeStudent(mockStudent);
        assertEquals(0, mockModule.getStudents().size());
    }

    @Test
    public void moduleAddRemoveCourse() {
        Course mockCourse = new Course("Campieter Sciunce");

        mockModule.addCourse(mockCourse);

        assertEquals(1, mockModule.getCourses().size());
        assertEquals("Campieter Sciunce", mockModule.getCourses().get(0).getName());

        mockModule.removeCourse(mockCourse);
        assertEquals(0, mockModule.getCourses().size());
    }
}

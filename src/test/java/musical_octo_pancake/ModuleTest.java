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

        mockModule.addStudent(mockStudent);

        assertEquals(1, mockModule.getStudents().size());
        assertEquals(mockStudent.getId(), mockModule.getStudents().get(0).getId());

        assertEquals(1, mockStudent.getModules().size());
        assertEquals(mockModule.getName(), mockStudent.getModules().get(0).getName());

        mockModule.removeStudent(mockStudent);
        assertEquals(0, mockModule.getStudents().size());
        assertEquals(0, mockStudent.getModules().size());
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

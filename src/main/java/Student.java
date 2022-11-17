import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;
    private Integer age;
    private DateTime dob;
    private Integer id;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    Student(){}

    Student(
            String name,
            Integer age,
            DateTime dob, // Date Of Birth
            Integer id,
            ArrayList<Module> modules,
            ArrayList<Course> courses  // a student can't be in multiple courses, but I'm allowing for flexibility
    ) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules =modules;
    }

    Student(
            String name,
            Integer age,
            String dob,
            Integer id,
            Module[] modules,
            Course course
    ) {
        this.name = name;
        this.age = age;
        // Not handling other formats since it's outside of the scope of the assignment
        this.dob = DateTime.parse(dob, DateTimeFormat.forPattern("dd/MM/yyyy"));
        this.id = id;
        this.modules = new ArrayList<Module>(Arrays.asList(modules));
        this.courses = new ArrayList<Course>();
        this.courses.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return name+age;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

}

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private DateTime now = DateTime.now();

    private String name;
    private DateTime dob;
    private Integer id;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    Student(){}

    Student(
            String name,
            DateTime dob, // Date Of Birth
            Integer id,
            ArrayList<Module> modules,
            ArrayList<Course> courses  // A student can't be in multiple courses, but I'm allowing for flexibility
    ) {
        this.name = name;
        this.dob = dob;
        this.id = id;
        this.modules =modules;
        this.courses = courses;
    }

    Student(
            String name,
            String dob,
            Integer id,
            Module[] modules,
            Course course
    ) {
        this.name = name;
        // Not handling other formats since it's outside of the scope of the assignment
        setDob(dob);
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
        if(dob != null){
            return Years.yearsBetween(dob, now).getYears();
        }
        return null;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public void setDob(String dob) {
        this.dob = DateTime.parse(dob, DateTimeFormat.forPattern("dd/MM/yyyy"));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return name+getAge();
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

    public DateTime getNow() {
        return now;
    }

    public void setNow(DateTime now) {
        this.now = now;
    }

    public void setNow() {
        setNow(DateTime.now());
    }
}

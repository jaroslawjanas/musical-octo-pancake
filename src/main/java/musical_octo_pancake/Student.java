package musical_octo_pancake;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;

import java.util.ArrayList;

public class Student {
    private final int minId = 1111111;
    private final int maxId = 9999999;

    private String name;
    private DateTime dob;
    private Integer id;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    Student(){
        this.id = minId + (int)(Math.random() * ((maxId - minId) + 1));
    }

    Student(
            String name,
            String dob
    ) {
        this();
        this.name = name;
        setDob(dob);
    }

    Student(
            String name,
            DateTime dob
    ) {
        this();
        this.name = name;
        this.dob = dob;
    }

    Student(
            String name,
            DateTime dob, // Date Of Birth
            ArrayList<Module> modules,
            ArrayList<Course> courses  // A student can't be in multiple courses, but I'm allowing for flexibility
    ) {
        this(name, dob);
        this.modules = modules;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        if(dob != null){
            return Years.yearsBetween(dob, DateTime.now()).getYears();
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

}

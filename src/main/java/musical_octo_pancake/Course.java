package musical_octo_pancake;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;

import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private DateTime starDate;
    private DateTime endDate;

    public Course() {}

    public Course(String name) {
        this.name = name;
    }

    public Course(
            String name,
            ArrayList<Module> modules,
            ArrayList<Student> students
    ) {
        this(name);
        this.modules = modules;
        this.students = students;
    }

    public Course(
            String name,
            ArrayList<Module> modules,
            ArrayList<Student> students,
            DateTime starDate,
            DateTime endDate
    ) {
        this(name, modules, students);
        this.starDate = starDate;
        this.endDate = endDate;
    }

    public Course(
            String name,
            ArrayList<Module> modules,
            ArrayList<Student> students,
            String starDate,
            String endDate
    ) {
        this(name, modules, students);
        setStarDate(starDate);
        setEndDate(endDate);
    }

    public DateTime stringToDate(String date) {
        return DateTime.parse(date, DateTimeFormat.forPattern("dd/MM/yyyy"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStarDate() {
        return starDate;
    }

    public void setStarDate(DateTime starDate) {
        this.starDate = starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = stringToDate(starDate);
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = stringToDate(endDate);
    }

    public Integer duration() {
        return Years.yearsBetween(starDate, endDate).getYears();
    }

    public void addModule(Module module) {
        modules.add(module);

        for(Student student : module.getStudents()){
            student.addCourse(this);
            students.add(student);
        }

        module.addCourse(this);
    }

    public void removeModule(Module module) {
        modules.remove(module);

        for(Student student : module.getStudents()){
            student.removeCourse(this);
            students.remove(student);
        }

        module.removeCourse(this);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("\n");
        str.append("Course Name: ").append(name);
        str.append("\n");
        str.append("  Start Date: ").append(starDate.toLocalDate().toString());
        str.append("\n");
        str.append("  End Date: ").append(endDate.toLocalDate().toString());
        str.append("\n");
        str.append("  Modules: ");
        for (Module module : modules) {
            str.append("\n");
            str.append("   - ").append(module.getName()).append("(").append(module.getId()).append(")");
        }
        str.append("\n");
        str.append("  Students: ");
        for (Student student : students) {
            str.append("\n");
            str.append("   @ ").append(student.getName());
        }
        return str.toString();
    }
}

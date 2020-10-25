package musical_octo_pancake;

import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Module(){
    }

    public Module(
            String name,
            String id
    ) {
        this.name = name;
        this.id = id;
    }

    public Module(
            String name,
            String id,
            ArrayList<Student> students,
            ArrayList<Course> courses
    ) {
        this(name, id);
        this.students = students;
        this.courses = courses;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.addModule(this);
    }

    public void removeStudent(Student student) {
        student.removeModule(this);
        students.remove(student);
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void removeCourse(Course course) {
        courses.remove(course);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("\n");
        str.append("Module Name: ").append(name);
        str.append("\n");
        str.append("  Id: ").append(id);
        str.append("\n");
        str.append("  Courses: ");
        for (Course course : courses) {
            str.append("\n");
            str.append("   - ").append(course.getName());
        }
        str.append("  Students: ");
        for (Student student : students) {
            str.append("\n");
            str.append("   @ ").append(student.getName());
        }
        return str.toString();
    }
}

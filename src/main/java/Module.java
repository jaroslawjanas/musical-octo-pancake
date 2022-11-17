import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    Module(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

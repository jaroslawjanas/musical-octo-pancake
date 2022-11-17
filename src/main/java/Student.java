import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {

    private String name;
    private Integer age;
    private DateTime dob;
    private Integer id;
    private String username;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

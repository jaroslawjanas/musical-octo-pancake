import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private DateTime starDate;
    private DateTime endDate;

    Course() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private List<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

}

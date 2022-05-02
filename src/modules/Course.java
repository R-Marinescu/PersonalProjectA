package modules;
import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String name;
    private String stream;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;


    public Course(String name, String stream, String type, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void printAssignments() {

    }

    public ArrayList<Assignment> getAssignments() {

        return null;
    }

    @Override
    public String toString() {
        return "\n" +"Course" +
                "name: " + name + "\n" +
                "stream: " + stream + "\n" +
                "type: " + type  + "\n" +
                "startDate: " + startDate  + "\n" +
                "endDate: " + endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}

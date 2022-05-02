package modules;

import java.time.LocalDate;

public class Assignment {
    private String name;
    private String description;
    private LocalDate subDate;
    private int oralMark;
    private int totalMark;


    public Assignment(String name, String description, LocalDate subDate, int oralMark, int totalMark) {
        this.name = name;
        this.description = description;
        this.subDate = subDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDate() {
        return subDate;
    }

    public void setSubDate(LocalDate subDate) {
        this.subDate = subDate;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "\n" + "Assignment/Project " +
                "name: " + name + "\n" +
                "Description: " + description + "\n" +
                "SubDate: " + subDate + "\n" +
                "OralMark: " + oralMark + "\n" +
                "TotalMark: " + totalMark;
    }
}

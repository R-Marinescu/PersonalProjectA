package modules;
import Human.Student;
import Human.Trainer;

import java.time.LocalDate;
import java.util.ArrayList;

public class Java extends Course{
    private ArrayList<Student> students;
    private ArrayList<Trainer> trainers;
    private ArrayList<Assignment> assignments;

    public Java(String name, String stream, String type, LocalDate startDate, LocalDate endDate) {
        super(name, stream, type, startDate, endDate);
        this.students = new ArrayList<>();
        this.trainers = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }


    // Method that adds students
    public void addStudents(Student addS) {   // Method that adds students
        students.add(addS);
    }


    // Method that prints students per course (Java)
    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    // Method that adds trainers
    public void addTrainers(Trainer addT) {
        trainers.add(addT);
    }

    // Method that prints trainers per course (Java)
    public void printTrainers() {
        for (Trainer t : trainers) {
            System.out.println(t.toString());
        }
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    // Method that adds assignments
    public void addAssignments(Assignment addA) {
        assignments.add(addA);
    }

    // Method that prints assignments per course (Java)
    public void printAssignments() {
        for (Assignment a : assignments) {
            System.out.println(a.toString());
        }
    }
}

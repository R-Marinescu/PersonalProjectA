package modules;

import Human.Student;
import Human.Trainer;

import java.time.LocalDate;
import java.util.ArrayList;

public class CSharp extends Course{
    private ArrayList<Student> students;
    private ArrayList<Trainer> trainers;
    private ArrayList<Assignment> assignments;

    public CSharp(String name, String stream, String type, LocalDate startDate, LocalDate endDate) {
        super(name, stream, type, startDate, endDate);
        this.students = new ArrayList<>();
        this.trainers = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // Method that ADDS students per course (C#)
    public void addStudents(Student addS) {
        students.add(addS);
    }


    // Method that prints students per course (C#)
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

    // Method that prints trainers per course (C#)
    public void printTrainers() {
        for (Trainer t : trainers) {
            System.out.println(t.toString());
        }
    }

    public ArrayList<Assignment> getAssignments(){
        return assignments;
    }

    // Method that adds assignments
    public void addAssignments(Assignment addA) {
        assignments.add(addA);
    }

    // Method that prints assignment per course (C#)
    public void printAssignments() {
        for (Assignment a : assignments) {
            System.out.println(a.toString());
        }
    }



}

package Human;


import modules.Assignment;
import modules.CSharp;
import modules.Course;
import modules.Java;

import java.util.ArrayList;
import java.time.LocalDate;

public class Student extends Human {
    private LocalDate dOB;
    private double tuitionFees;
    private ArrayList<Assignment> assignments;
    private ArrayList<Course> courses;


    public Student(String fName, String lName, LocalDate dOB, double tuitionFees) {
        super(fName, lName);
        this.dOB = dOB;
        this.tuitionFees = tuitionFees;
        this.assignments = new ArrayList<>();
        this.courses = new ArrayList<>();


    }


    public LocalDate getdOB() {
        return dOB;
    }

    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public ArrayList<Assignment> getAssignments() { // Find the assignments from all the courses
        ArrayList<Assignment> result = new ArrayList<>();
        for(Course sCourse : courses) {
            ArrayList<Assignment> assi = sCourse.getAssignments();
            for(Assignment a : assi) {
                result.add(a);
            }
        }
        return result;
    }

    // Method that adds assignments
    public void addAssignments(Assignment addA) {
        assignments.add(addA);
    }
    public void addAssignments2(Assignment addA, Assignment addB) {
        assignments.add(addA);
        assignments.add(addB);
    }

    // Method that prints assignments
    public void printAssignments() {
        for (Assignment a : assignments) {
            System.out.println(a.toString());
        }
      /*  for (Course c : courses){
            c.printAssignments();
        } */
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + getfName() + "\n" + "Lastname: " + getlName() +
                "\n" + "Date of birth: " + dOB +
                "\n" + "Tuition fees: " + tuitionFees + "\n";

    }

    //Method that prints courses
    public void printCourses() {
        for (Course c : courses) {
            System.out.println(c.toString());
        }
    }
    //Method that adds courses
    public void addCourses(Course j1) {
        courses.add(j1);
    }

    public void addCourses2(Course j1, Course j2) {
        courses.add(j1);
        courses.add(j2);
    }
}

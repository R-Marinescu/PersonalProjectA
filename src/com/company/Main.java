package com.company;

import Human.Student;
import Human.Trainer;
import modules.*;
import modules.Scan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static modules.Scan.addDate;
import static modules.Scan.addStud;


public class Main {

    public static void main(String[] args) {


        //Scanner userInput = new Scanner(System.in);

      //  addStud();

        // Courses
        CSharp c1 = new CSharp("Computer Science","C#", "Classes",LocalDate.of(2021,8,14),LocalDate.of(2021,11,24));
        Java j1 = new Java("Computer science", "Java", "OOB", LocalDate.of(2020, 5,21), LocalDate.of(2020,9,23));

        //Students
        Student s1 = new Student("Radu", "Marinescu",LocalDate.of(1990,12,24), 245);
        Student s2 = new Student("Aoife", "Blair", LocalDate.of(1991,8,16), 923);
        Student s3 = new Student("John", "Doe", LocalDate.of(1995,2,4), 423);
        Student s4 = new Student("Bryan", "McWig", LocalDate.of(1996,3,19), 853);
        Student s5 = new Student("Joe", "Doe", LocalDate.of(1999,9,10), 563);
        Student s6 = new Student("James", "Mosh", LocalDate.of(1996,3,14), 333);
        //Takes user input
        Student s7 = addStud();
        Student s8 = addStud();

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        //Adds user input (Student) object into the arrayList
        students.add(s7);
        students.add(s8);
        System.out.println(students);

        //Trainers
        Trainer t1 = new Trainer("Andrew", "Anderson","Java");
        Trainer t2 = new Trainer("Mike", "McAlison","C#");
        Trainer t3 = new Trainer("Josh", "McGregor","Java");
        Trainer t4 = new Trainer("Gorge", "Axe","C#/JAva");

        ArrayList<Trainer> trainers = new ArrayList<>();
        trainers.add(t1);
        trainers.add(t2);
        trainers.add(t3);
        trainers.add(t4);


        //Assignments
        Assignment a1 = new Assignment("Project A", "100 words",LocalDate.of(2020,5,23), 75,100);
        Assignment a2 = new Assignment("Project B", "100 words", LocalDate.of(2020,5,23), 75,100);
        Assignment a3 = new Assignment("Assignment 1", "100 words",LocalDate.of(2020,5,23), 75,100);
        Assignment a4 = new Assignment("Assignment 2", "100 words",LocalDate.of(2020,5,23), 75,100);

        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        assignments.add(a4);




        // Add Students to Java (j1) course
        j1.addStudents(s1);
        j1.addStudents(s2);
        j1.addStudents(s6);
        j1.addStudents(s4);
        j1.addStudents(s8);

        //Add Trainers to Java
        j1.addTrainers(t1);
        j1.addTrainers(t3);
        j1.addTrainers(t4);

        //Add Assignments to Java
        j1.addAssignments(a1);
        j1.addAssignments(a3);
        j1.addAssignments(a2);

        // Add students to CSharp
        c1.addStudents(s1);
        c1.addStudents(s3);
        c1.addStudents(s4);
        c1.addStudents(s5);
        c1.addStudents(s7);

        //Add Trainers to CSharp
        c1.addTrainers(t2);
        c1.addTrainers(t4);

        //Add Assignments to CSharp
        c1.addAssignments(a2);
        c1.addAssignments(a4);
        c1.addAssignments(a1);

        //Add assignment to students
         s1.addAssignments2(a1,a3);
         s2.addAssignments(a2);
         s3.addAssignments2(a1,a2);
         s4.addAssignments(a4);
         s5.addAssignments2(a1,a4);
         s7.addAssignments(a3);

         //Add courses to students
         s1.addCourses2(j1,c1);
         s3.addCourses2(j1,c1);
         s6.addCourses2(j1,c1);
         s8.addCourses2(j1,c1);


         //List of all students
        System.out.println("List of students:");
        System.out.println(students);
        System.out.println("--------------------------------------------------------------------------------");

        //List of all trainers
        System.out.println("List of trainers:");
        System.out.println(trainers);
        System.out.println("--------------------------------------------------------------------------------");

        //List of all assignments
        System.out.println("List of assignments");
        System.out.println(assignments);
        System.out.println("--------------------------------------------------------------------------------");

        //List of all courses
        System.out.println("List of courses:");
        System.out.println(j1 + "\n" + c1 + "\n");

        //All students per course
        System.out.println("Students in Java course:" + "\n");
        j1.printStudents();
        System.out.println("Students in C# course:" + "\n");
        c1.printStudents();
        System.out.println("--------------------------------------------------------------------------------");

        //All trainers per course
        System.out.println("Trainers for Java:");
        j1.printTrainers();
        System.out.println("Trainers for C#:");
        c1.printTrainers();
        System.out.println("--------------------------------------------------------------------------------");

        //All Assignments per course
        System.out.println("Assignments for Java");
        j1.printAssignments();
        System.out.println("\n" + "Assignments for C#");
        c1.printAssignments();
        System.out.println("--------------------------------------------------------------------------------");

        //All assignments per student
        System.out.println("\n" + "Assignments for Radu:" );
        s1.printAssignments();
        System.out.println("\n" + "Assignments for Aoife:" );
        s2.printAssignments();
        System.out.println("\n" + "Assignments for John:");
        s3.printAssignments();
        System.out.println("\n" + "Assignments for Bryan:");
        s4.printAssignments();
        System.out.println("\n" + "Assignments for Joe:");
        s5.printAssignments();
        System.out.println("--------------------------------------------------------------------------------");

        //List of students that belong to more than one courses
        System.out.println("\n" + "Radu's Courses:" );
        s1.printCourses();
        System.out.println("\n" + "John's Courses:" );
        s3.printCourses();
        System.out.println("\n" + "James Courses:" );
        s6.printCourses();


    } // end of main


}

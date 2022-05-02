package modules;
import Human.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Scan {

    //method that takes user input and parses it from String to LocaleDate
    public static LocalDate addDate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date of birth [dd/mm/yyyy]");
        String str = scan.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(str, dtf);
    }

    // Method that checks if user inputs numbers instead of letters
    public static boolean checks(String input){
        boolean isValid = true;
        if (input.contains("1")) {
            isValid = false;
        }
        if (input.contains("2")) {
            isValid = false;
        }
        if (input.contains("3")) {
            isValid = false;
        }
        if (input.contains("4")) {
            isValid = false;
        }
        if (input.contains("5")) {
            isValid = false;
        }
        if (input.contains("6")) {
            isValid = false;
        }
        if (input.contains("7")) {
            isValid = false;
        }
        if (input.contains("8")) {
            isValid = false;
        }
        if (input.contains("9")) {
            isValid = false;
        }
        if (input.contains("10")) {
            isValid = false;
        }
        return isValid;
    }
    //Method that takes user input and stores it into Student object
    public static Student addStud() {
        boolean isValid = true;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input name, lastname, date of birth and a number(tuition fees)");

        String firstname;
        do {
            System.out.println("Enter first name: ");
            firstname = userInput.nextLine();
             isValid = checks(firstname);
        }while(isValid == false);

        String lastName;
        do {
            System.out.println("Last name: ");
            lastName = userInput.nextLine();
            isValid = checks(lastName);
        }while(isValid == false);
        LocalDate date = addDate();
        System.out.println("Input tuition fees");
        Double tFees = userInput.nextDouble();

        Student stud = new Student(firstname, lastName, date, tFees);
        return stud;

    }

}

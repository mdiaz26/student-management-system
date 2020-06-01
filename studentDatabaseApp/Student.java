package studentDatabaseApp;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int idCount = 1000;
    
    // Constructor (name, year)
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1- Freshman \n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter student class level: ");
        this.year = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + year + " " + studentID);
    }

    // Generate an ID
    private void setStudentID(){
        this.studentID = this.year + "" + idCount;
        idCount++;
    }

    // Enroll in courses
    public void enroll(){
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else { break; }
        } while (1 != 0);

        System.out.println("ENROLLED IN " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);
    }

    // View Balance

    // Pay Tuition

    // Print status of student
}
package studentDatabaseApp;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private ArrayList<String> courses = new ArrayList<String>();
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
    }

    // Generate an ID
    private void setStudentID(){
        this.studentID = this.year + "" + idCount;
        idCount++;
    }

    // Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses.add(course);
                tuitionBalance = tuitionBalance + costOfCourse;
            } else { break; }
        } while (1 != 0);

    }

    // View Balance
    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    private String toString(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String course : list) {
            sb.append(" ");
            sb.append(course);
            sb.append("\n");
        }
        return sb.toString();
    }

    // Print status of student
    public String showInfo(){
        return firstName + " " + lastName + 
        "\nGrade Level: " + year +
        "\nStudent ID: " + studentID +
        "\nCourses Enrolled: \n" + toString(courses) + 
        "\nBalance : " + tuitionBalance;
    }
}
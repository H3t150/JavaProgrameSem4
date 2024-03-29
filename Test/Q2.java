package Test;

import java.util.Scanner;

class Student {
    
    String studentFirstName,studentLastName;
    double marksMaths, marksScience, marksEnglish,studentID;

    void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentID = scanner.nextDouble();

        System.out.print("Enter Student First Name: ");
        studentFirstName = scanner.next();

        System.out.print("Enter Student Last Name: ");
        studentLastName = scanner.next();

        System.out.print("Enter Marks for Maths : ");
        marksMaths = scanner.nextDouble();

        System.out.print("Enter Marks for Science: ");
        marksScience = scanner.nextDouble();

        System.out.print("Enter Marks for English: ");
        marksEnglish = scanner.nextDouble();
        scanner.close();
    }

    void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentFirstName +" "+ studentLastName);
        System.out.println("Marks for Maths: " + marksMaths);
        System.out.println("Marks for Science: " + marksScience);
        System.out.println("Marks for English: " + marksEnglish);
    }

    double calculateAverageMarks() {
        return (marksMaths + marksScience + marksEnglish) / 3;
    }
}

public class Q2{
    public static void main(String[] args) {
        Student student = new Student();
        student.setData();
        System.out.println("\nStudent Details:");
        student.displayData();
        System.out.print("Average Marks: " + student.calculateAverageMarks());
    }
}



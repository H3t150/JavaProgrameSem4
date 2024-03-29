package BYOD;

import java.util.Scanner;

public class MarkSheet {
   private int studentID;
    private String studentName;
    private double marksMaths, marksScience, marksEnglish;

   public void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentID = scanner.nextInt();

        System.out.print("Enter Student Name: ");
        studentName = scanner.next();

        System.out.print("Enter Marks for Maths : ");
        marksMaths = scanner.nextDouble();

        System.out.print("Enter Marks for Science: ");
        marksScience = scanner.nextDouble();

        System.out.print("Enter Marks for English: ");
        marksEnglish = scanner.nextDouble();
        scanner.close();
    }

   public void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks for Maths: " + marksMaths);
        System.out.println("Marks for Science: " + marksScience);
        System.out.println("Marks for English: " + marksEnglish);
    }

   public double calculateAverageMarks() {
        return (marksMaths + marksScience + marksEnglish) / 3;
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setData();
        System.out.println("\nStudent Details:");
        student.displayData();
        System.out.print("Average Marks: " + student.calculateAverageMarks());
    }
}


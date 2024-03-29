package Lab;

import java.util.Scanner;

class Student1 {
    int studentID;
    String studentName;
    double[] marks = new double[3];

    // Setter method to set data for a student
    public void setData(int id, String name, double mark1, double mark2, double mark3) {
        studentID = id;
        studentName = name;
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
    }

    // Method to calculate average marks
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    

    // Method to display student data
    public void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks in Subject 1: " + marks[0]);
        System.out.println("Marks in Subject 2: " + marks[1]);
        System.out.println("Marks in Subject 3: " + marks[2]);
        System.out.println("Average Marks: " + calculateAverage());
    }
}
    public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter marks for Subject 1:");
        double mark1 = scanner.nextDouble();
        System.out.println("Enter marks for Subject 2:");
        double mark2 = scanner.nextDouble();
        System.out.println("Enter marks for Subject 3:");
        double mark3 = scanner.nextDouble();

        // Create an instance of Student class
        Student student = new Student();

        // Set data for the student
        student.setData(id, name, mark1, mark2, mark3);

        // Display student data
        System.out.println("\nStudent Details:");
        student.displayData();

        scanner.close();
    }}
package BYOD;

import java.util.Scanner;

public class Student implements Comparable<Student> {

    // Private fields
    private String studentName;
    private int age;

    // Default constructor
    public Student() {
        this.studentName = "";
        this.age = 0;
         
    }

    // Parameterized constructor
    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    // Public getters and setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && studentName.equals(student.studentName);
    }

    // CompareTo method
    @Override
    public int compareTo(Student o) {
        // Compare based on age
        return Integer.compare(this.age, o.age);
    }

    // ToString method
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                '}';
    }

    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        // Clean-up or resource releasing logic
        
    }

    // Instance method for taking user input
    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        setStudentName(scanner.nextLine());

        System.out.print("Enter student age: ");
        setAge(scanner.nextInt());
        scanner.close();
    }

    public static void main(String[] args) {
        // Example usage of the class with user input
        Student student = new Student();
        student.takeUserInput();

        // Using toString method to display the information
        System.out.println(student.toString());
    }
}

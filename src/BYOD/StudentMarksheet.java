package BYOD;
import java.util.Scanner;

public class StudentMarksheet implements Comparable<StudentMarksheet> {

    // Private fields
    private String studentName;
    private int subject1Marks;
    private int subject2Marks;  
    private int subject3Marks;

    // Default constructor
    public StudentMarksheet() {
        this.studentName = "";
        this.subject1Marks = 0;
        this.subject2Marks = 0;
        this.subject3Marks = 0;
    }

    // Parameterized constructor
    public StudentMarksheet(String studentName, int subject1Marks, int subject2Marks, int subject3Marks) {
        this.studentName = studentName;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    // Public getters and setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSubject1Marks() {
        return subject1Marks;
    }

    public void setSubject1Marks(int subject1Marks) {
        this.subject1Marks = subject1Marks;
    }

    public int getSubject2Marks() {
        return subject2Marks;
    }

    public void setSubject2Marks(int subject2Marks) {
        this.subject2Marks = subject2Marks;
    }

    public int getSubject3Marks() {
        return subject3Marks;
    }

    public void setSubject3Marks(int subject3Marks) {
        this.subject3Marks = subject3Marks;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentMarksheet that = (StudentMarksheet) obj;
        return subject1Marks == that.subject1Marks &&
                subject2Marks == that.subject2Marks &&
                subject3Marks == that.subject3Marks &&
                studentName.equals(that.studentName);
    }

    // CompareTo method
    @Override
    public int compareTo(StudentMarksheet o) {
        // Compare based on total marks (sum of all subjects)
        int totalMarksThis = subject1Marks + subject2Marks + subject3Marks;
        int totalMarksOther = o.subject1Marks + o.subject2Marks + o.subject3Marks;
        return Integer.compare(totalMarksThis, totalMarksOther);
    }

    // ToString method
    @Override
    public String toString() {
        return "StudentMarksheet{" +
                "studentName='" + studentName + '\'' +
                ", subject1Marks=" + subject1Marks +
                ", subject2Marks=" + subject2Marks +
                ", subject3Marks=" + subject3Marks +
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

        System.out.print("Enter marks for Subject 1: ");
        setSubject1Marks(scanner.nextInt());

        System.out.print("Enter marks for Subject 2: ");
        setSubject2Marks(scanner.nextInt());

        System.out.print("Enter marks for Subject 3: ");
        setSubject3Marks(scanner.nextInt());
        scanner.close();
    }

    public static void main(String[] args) {
        // Example usage of the class with user input
        StudentMarksheet student = new StudentMarksheet();
        student.takeUserInput();

        // Using toString method to display the information
        System.out.println(student.toString());
    }
}


package Lab;
class Person {
    protected String name;
    protected int age;

    // Constructor for the Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private String employeeId;
    private double salary;

    // Constructor for the Employee class
    public Employee(String name, int age, String employeeId, double salary) {
        // Calling the constructor of the base class (Person)
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display information about the employee
    public void displayEmployeeInfo() {
        // Accessing attributes from the base class (Person)
        displayPersonInfo();
        System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
    }
}

public class Company {
    public static void main(String[] args) {
        // Creating objects of both classes
        Person personObject = new Person("John Doe", 30);
        Employee employeeObject = new Employee("Jane Smith", 25, "E12345", 50000);

        // Demonstrating inheritance by accessing attributes
        System.out.println("Person Object:");
        personObject.displayPersonInfo();

        System.out.println("\nEmployee Object:");
        employeeObject.displayEmployeeInfo();
    }
}

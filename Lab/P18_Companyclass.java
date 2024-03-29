package Lab;

class Person {
    String Name;
    int age;

    Person(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name = " + Name);
        System.out.println("Age = " + age);
    }
}

class Employee extends Person {
    int EID, Salary;

    Employee(int EID, String Name, int age, int Salary) {
        super(Name, age);
        this.EID = EID;
        this.Salary = Salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID = " + EID);
        System.out.println("Salary = " + Salary);
    }
}

public class P18_Companyclass {
    public static void main(String[] args) {
        Employee Het = new Employee(1112, "Het Panchal", 19, 100000);
        Het.displayPerson();
        Het.displayEmployee();
    }
}

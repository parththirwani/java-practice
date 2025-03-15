// Employee.java
class Employee {
    public int id;             // public: accessible everywhere
    protected String name;     // protected: accessible within the package and by subclasses
    int age;                   // default (package-private): accessible only within the same package
    private double salary;     // private: accessible only within this class

    // Public constructor to initialize all fields
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter method to access the private salary field
    public double getSalary() {
        return salary;
    }

    // Setter method to modify the private salary field
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Default access method to display employee information
    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }
}

// AccessModifiersDemo.java
public class AccessModifiersDemo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "Alice", 30, 50000.0);
        
        // Display initial details
        System.out.println("Initial Employee Details:");
        emp.displayEmployeeInfo();
        System.out.println();

        // Use the setter method to update the salary
        System.out.println("Updating salary...");
        emp.setSalary(55000.0);
        
        // Display the updated salary using the getter method
        System.out.println("Updated Salary (via getter): " + emp.getSalary());
        System.out.println();

        // Display updated details
        System.out.println("Updated Employee Details:");
        emp.displayEmployeeInfo();
    }
}

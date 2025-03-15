class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor is called");
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called.");
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
        System.out.println("Copy constructor called");
    }

    // Method to display person's information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
} // <-- Closing brace for the Person class

public class Constructor {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();

        Person person2 = new Person("Parth", 21);
        person2.displayInfo();

        Person person3 = new Person(person2);
        person3.displayInfo();
    }
}

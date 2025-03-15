
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class with the main method
public class Person {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age > 100) {
            throw new InvalidAgeException("Age cannot be over 100");
        }else if (age<0){
            throw new InvalidAgeException("Age cannot be negative");
        }else 
        System.out.println("The age of the person is "+age);
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(5);
        } catch (InvalidAgeException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}

// Final variable demonstration
class FinalVariableDemo {
    // Instance final variable: its value can be set only once (here, in the constructor)
    final int instanceFinal;
    
    // Static final variable (constant): conventionally named in uppercase
    static final double PI = 3.14159;

    public FinalVariableDemo(int value) {
        // Initialize the final variable. It can be assigned only once.
        this.instanceFinal = value;
    }
}

// Base class demonstrating a final method
class BaseClass {
    // A final method that cannot be overridden by any subclass
    public final void finalMethod() {
        System.out.println("This method is final and cannot be overridden.");
    }
    
    // A normal (non-final) method that can be overridden
    public void normalMethod() {
        System.out.println("This is a normal method in BaseClass.");
    }
}

// Subclass that extends BaseClass
class DerivedClass extends BaseClass {
    // Uncommenting the below method would cause a compile-time error because finalMethod() is final.
    // @Override
    // public void finalMethod() {
    //     System.out.println("Attempting to override finalMethod()");
    // }

    // Overriding the normal method is allowed.
    @Override
    public void normalMethod() {
        System.out.println("This is an overridden normal method in DerivedClass.");
    }
}

// Final class demonstration
final class FinalClass {
    public void display() {
        System.out.println("This is a final class, so it cannot be extended.");
    }
}

// The following code would result in a compile-time error because FinalClass cannot be extended.
// class SubFinalClass extends FinalClass { }

public class FinalKeywordExample {
    public static void main(String[] args) {
        // Demonstrate final variables
        FinalVariableDemo fvDemo = new FinalVariableDemo(100);
        System.out.println("Instance final variable: " + fvDemo.instanceFinal);
        System.out.println("Static final variable PI: " + FinalVariableDemo.PI);
        
        // Demonstrate final method usage
        BaseClass base = new BaseClass();
        base.finalMethod();       // Calls the final method from BaseClass
        base.normalMethod();      // Calls the normal method from BaseClass
        
        DerivedClass derived = new DerivedClass();
        derived.finalMethod();    // Inherited final method (cannot be overridden)
        derived.normalMethod();   // Calls the overridden normal method from DerivedClass
        
        // Demonstrate final class usage
        FinalClass finalObj = new FinalClass();
        finalObj.display();
    }
}

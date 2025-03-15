 //method overloading
 class MathOperations {
    // Overloaded method: two int parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method: three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations maths = new MathOperations();
        
        int sumTwo = maths.add(10, 5);
        
        int sumThree = maths.add(10, 5, 15);
        
        System.out.println("Result of add(10, 5): " + sumTwo);
        System.out.println("Result of add(10, 5, 15): " + sumThree);
    }
}

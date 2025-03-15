class Animal{
    void eat(){
        System.out.println("Animals eat food");
    }
}

//Inheritance with Runtime Polymorphism (Method Overriding)
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog eats Dog food");
    }
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}

class Animal{
    void eat(){
        System.out.println("Animals eats food");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog eats dog food");
    }

    void pet(String name){
        System.out.println("Pet my dog "+name);
    }

    void pet(int times){
        System.out.println("Pet my dog "+times+" times");
    }
}

public class Overloading {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.pet("lucy");
        myDog.pet(5);
    }
}
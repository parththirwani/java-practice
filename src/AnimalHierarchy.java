// Base class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass Dog overriding makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Subclass Cat overriding makeSound()
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Subclass Cow overriding makeSound()
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow moos.");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

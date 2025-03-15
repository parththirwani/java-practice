interface Flyable{
    void fly();
}

interface Swimming{
    void swim();
}

class Duck implements Flyable,Swimming{
    public void fly() {
        System.out.println("Duck is flying.");
    }

    public void swim(){
        System.out.println("Duck is Swimming.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Duck myDuck = new Duck();
        myDuck.fly();
        myDuck.swim();
    }    
}

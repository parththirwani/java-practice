//Question 1
class Person{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Person person = new Person();
        person.setName("Parth");
        System.out.println("The name is "+person.getName());

    }
}
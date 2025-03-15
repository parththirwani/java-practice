class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name= name;
        this.age=age;
    }

    void display(){
        System.out.println("The name is: "+name);
        System.out.println("The age is: "+age);
    }
}

class Student extends Person{
    String course;

    Student(String name, int age, String course){
        super(name, age);
        this.course=course;
    }

    @Override
    void display(){
        super.display();
        System.out.println("The course is: "+course);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args){
        Student student = new Student("Parth", 21, "Java");
        student.display();
    }
}
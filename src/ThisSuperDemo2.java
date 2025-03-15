class Shape{
    String color;

    Shape(String color){
        this.color=color;
    }

    void displayInfo(){
        System.out.println("The color of the shape is: "+color);     
    }
}

class Rectangle extends Shape{
    int Length;
    int Width;

    Rectangle(int Length, int Width, String color){
        super(color);
        this.Length=Length;
        this.Width=Width;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("The length of rectangle is: "+Length);
        System.out.println("The width of rectangle is: "+Width);
    }
}

public class ThisSuperDemo2 {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10, 20, "blue");
        rectangle.displayInfo();
    }
}
 interface Drawable {
    void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("A circle is drawn");
    }
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("A rectangle is Drawn");
    }
}

public class Abstraction{
    public static void main(String[] args){
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();
        myCircle.draw();
        myRectangle.draw();
    }
}
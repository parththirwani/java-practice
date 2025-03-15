@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}

public class LambdaExample{
    public static void main(String[] args){
        Calculator add = (a,b) -> a+b;
        Calculator multiply = (a,b) -> a*b;

        System.out.println("Addition: "+add.calculate(15, 20));
        System.out.println("Multiplication: "+multiply.calculate(10, 20));
    }
}
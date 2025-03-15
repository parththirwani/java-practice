import java.util.Scanner;

public class ScannerProgramFlow {
    public static void main (String[] args){
    Scanner scanner  = new Scanner(System.in);
    System.out.println("Enter your first msg");
    String first = scanner.nextLine();
    System.out.println(first);

    System.out.println("Enter your second msg");
    String second = scanner.nextLine();
    System.out.println(second);
    
    System.out.println("Enter your third msg");
    String third = scanner.nextLine();
    System.out.println(third);
    }

}

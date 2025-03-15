public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Error: Index out of bounds!");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}

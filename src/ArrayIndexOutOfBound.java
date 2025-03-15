public class ArrayIndexOutOfBound{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // Accessing an index that is out of the array's bounds (array length is 3, valid indices: 0-2)
            int num = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

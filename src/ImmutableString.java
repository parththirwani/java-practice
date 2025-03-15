public class ImmutableString{
    public static void main(String[] args) {
        // Original string
        String original = "Hello";
        System.out.println("Original string: " + original);
        
        // Attempt to change the string by converting it to uppercase
        String upper = original.toUpperCase();
        System.out.println("After toUpperCase(): " + upper);
        System.out.println("Original string after toUpperCase(): " + original);

        // Attempt to replace a character in the string
        String replaced = original.replace("H", "J");
        System.out.println("After replace(): " + replaced);
        System.out.println("Original string after replace(): " + original);

        // Attempt to concatenate another string
        String concatenated = original.concat(" World");
        System.out.println("After concat(): " + concatenated);
        System.out.println("Original string after concat(): " + original);

        // Attempt to create a substring
        String substring = original.substring(1, 4);
        System.out.println("After substring(): " + substring);
        System.out.println("Original string after substring(): " + original);
    }
}

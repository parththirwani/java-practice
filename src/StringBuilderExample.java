public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object with an initial string.
        StringBuilder sb = new StringBuilder("Hello");

        // Append text to the existing string.
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // Insert a substring at a specific index.
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb); // Output: Hello, Java World

        // Replace a substring from index 0 (inclusive) to 5 (exclusive) with a new string.
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb); // Output: Hi, Java World

        // Reverse the entire sequence.
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW avaJ ,iH

        // Delete characters from index 0 to 5 (exclusive).
        sb.delete(0, 5);
        System.out.println("After delete: " + sb); // Output: avaJ ,iH

        // Convert StringBuilder back to a String.
        String result = sb.toString();
        System.out.println("Final string: " + result);
    }
}

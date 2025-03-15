import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            // Trying to read from a file
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println("First line: " + line);
            br.close();
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }
}

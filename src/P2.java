import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P2 {
    public static void main(String[] args) {
        // Try-with-resources statement to ensure the reader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\Input.txt"))) {
            String line;
            // Read each line from the file and print it to the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P5 {
    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();

        // Try-with-resources statement to ensure BufferedReader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\Input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Original content read from file:");
            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reverse the content
        content.reverse();
        System.out.println("Reversed content:");
        System.out.println(content.toString());

        // Try-with-resources statement to ensure BufferedWriter is closed automatically
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\reversed.txt"))) {
            writer.write(content.toString());
            System.out.println("Reversed content written to reversed.txt successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

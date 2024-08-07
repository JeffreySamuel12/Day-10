import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String userInput = scanner.nextLine();

        // Try-with-resources statement to ensure FileWriter is closed automatically
        try (FileWriter writer = new FileWriter("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\user_input.txt")) {
            writer.write(userInput);
            System.out.println("User input written to user_input.txt successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

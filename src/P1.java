import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\Source.txt");
             FileWriter writer = new FileWriter("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\Destination.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File content copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.*;

public class TransactionFilter {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\transactions.txt";
        String outputFile = "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\filtered_transactions.txt";
        double threshold = 1000.0; // Set your threshold here

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                double transactionAmount = Double.parseDouble(fields[2]);

                if (transactionAmount > threshold) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            System.out.println("Filtered transactions written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

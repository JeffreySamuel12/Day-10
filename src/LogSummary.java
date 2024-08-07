import java.io.*;
import java.util.*;

public class LogSummary {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\logs.txt";
        String outputFile = "C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 10\\src\\logs_summary.txt";

        // HashMap to store log level counts
        Map<String, Integer> logLevelCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String logLevel = fields[1];

                // Update the count for the log level
                logLevelCounts.put(logLevel, logLevelCounts.getOrDefault(logLevel, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the summary report
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : logLevelCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }

            System.out.println("Log summary written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

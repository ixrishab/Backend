import java.io.*;
import java.util.*;

public class task1 {
    public static void main(String[] args) {

        int wordCount = 0;
        int sentenceCount = 0;
        int charCount = 0;

        Map<String, Integer> wordFrequency = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("task1.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Count sentences BEFORE cleaning
                for (char c : line.toCharArray()) {
                    if (c == '.' || c == '!' || c == '?') {
                        sentenceCount++;
                    } 
                }
                /*
        try (BufferedReader reader = new BufferedReader(new FileReader("task1.txt"))) {

            for (String line : reader.lines().toArray(String[]::new)) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
}
 */

                // Count characters
                charCount += line.replace(" ", "").length();

                //Rev 
                String[] sentences = line.split("(?<=[.!?])");//Spilt the sentences according to their symbol
                for (String s : sentences) {
                    //String Builder : lets u change the string without creating new objects everytime
                    String reversedSentence = new StringBuilder(s.trim()).reverse().toString();
                    System.out.println( reversedSentence);
                }

                
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

                
                line = line.replaceAll("\\s+", " ").trim();

                
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;

                    for (String word : words) {
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    }
                }
            }

            
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFrequency.entrySet());

            sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            
            System.out.println("Total characters excluding spaces: " + charCount);
            System.out.println("Total words: " + wordCount);
            System.out.println("Total sentences: " + sentenceCount);

            
            System.out.println("Top 5 most frequent occurring words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWords.get(i);
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        System.out.println("Comparing two Strings");
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        
        System.out.println("s1 == s2 : " + (s1 == s2)
                + "true because both point to the same String literal");

        System.out.println("s1 == s3 : " + (s1 == s3)
                + "false because s3 is a new object in heap memory");

        
        System.out.println("s1.equals(s2) : " + s1.equals(s2)
                + "true because contents are same");

        System.out.println("s1.equals(s3) : " + s1.equals(s3)
                + "true because equals() compares content, not reference");
    }
}

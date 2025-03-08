import java.util.Scanner;

public class WordCounter {

    // Method to get the sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();  // Read and return the input sentence
    }

    // Method to count the number of words in a given sentence
    public static int countWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.trim().split("\\s+");
        return words.length;  // Return the number of words
    }

    public static void main(String[] args) {
        // Get user input sentence
        String sentence = getSentenceInput();
        
        // Count words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
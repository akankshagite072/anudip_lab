import java.util.Scanner;

public class Lab8Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string/sentence
        System.out.print("Enter a string/sentence: ");
        String input = scanner.nextLine();

        // Find and display the longest word and its length
        String[] words = input.split("\\s+");
        String longestWord = findLongestWord(words);
        int longestWordLength = longestWord.length();

        System.out.println("The longest word: " + longestWord);
        System.out.println("The length of the word: " + longestWordLength);

        scanner.close();
    }

    private static String findLongestWord(String[] words) {
        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            // Remove any punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }
}

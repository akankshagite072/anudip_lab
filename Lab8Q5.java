import java.util.Scanner;

public class Lab8Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word or string
        System.out.print("Enter a word or string: ");
        String input = scanner.nextLine();

        // Remove vowels and display the result
        String result = removeVowels(input);
        System.out.println("Output after removing vowels: " + result);

        scanner.close();
    }

    private static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is not a vowel (both uppercase and lowercase)
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

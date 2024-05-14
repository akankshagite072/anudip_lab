/*4.WAP to enter any sentence and calculate the following:
a) Total number of digits present in it.
b) Total number of small letters and capital letters present in it.
c) Total number of alphabets used in it.
d) Total number of special character used in it.
e) Total number of vowels presents in it.
f) Total Number words present in that sentence.
*/

import java.util.Scanner;

public class Lab9q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        calculateProperties(sentence);

        scanner.close();
    }

    public static void calculateProperties(String sentence) {
        int digitCount = 0;
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;
        int vowelCount = 0;

        String trimmedSentence = sentence.trim();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                alphabetCount++;
                if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else {
                    uppercaseCount++;
                }
                if (isVowel(ch)) {
                    vowelCount++;
                }
            } else {
                specialCharCount++;
            }
        }

        String[] words = trimmedSentence.split("\\s+");
        int wordCount = words.length;

        System.out.println("Total number of digits: " + digitCount);
        System.out.println("Total number of small letters: " + lowercaseCount);
        System.out.println("Total number of capital letters: " + uppercaseCount);
        System.out.println("Total number of alphabets: " + alphabetCount);
        System.out.println("Total number of special characters: " + specialCharCount);
        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of words: " + wordCount);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

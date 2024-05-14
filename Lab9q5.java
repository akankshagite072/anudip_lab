
/*5.Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.
Sample Input: COMPUTER APPLICATIONS
Sample Output: CMPTR PPLCTNS*/
import java.util.Scanner;

public class Lab9q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeVowels(input);

        System.out.println("String after removing vowels: " + result);

        scanner.close();
    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


/*2.Write a method that takes a String[] as an argument and returns a String containing the concatenation of
 all the strings in the input array. Invoke your method 3 times
 with different arguments. Make sure that your code handles the cases where the argument is null.
 */
import java.util.Scanner;

public class Lab9q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();

        String[] inputStrings = new String[numStrings];

        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            inputStrings[i] = scanner.next();
        }

        String concatenatedString = concatenateStrings(inputStrings);

        System.out.println("Concatenated String: " + concatenatedString);

        scanner.close();
    }

    public static String concatenateStrings(String[] strings) {
        if (strings == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
}

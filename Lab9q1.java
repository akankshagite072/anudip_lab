//1.Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is

//"12345678", the return value should be "XXXX5678".

import java.util.Scanner;

public class Lab9q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();

        String masked = maskStringWithoutMethod(original);

        System.out.println("Masked string: " + masked);

        scanner.close();
    }

    public static String maskStringWithoutMethod(String input) {
        if (input.length() <= 4) {
            return input;
        }

        StringBuilder maskedString = new StringBuilder();

        for (int i = 0; i < input.length() - 4; i++) {
            maskedString.append('X');
        }

        maskedString.append(input.substring(input.length() - 4));

        return maskedString.toString();
    }
}

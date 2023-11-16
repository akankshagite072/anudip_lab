import java.util.Scanner;

public class UserChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Find out greater between 3 numbers");
            System.out.println("2. Check if a given number is even or odd");
            System.out.println("3. Check if a given character is a vowel");
            System.out.println("4. Check if a given number is divisible by 5");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findGreater();
                    break;
                case 2:
                    checkEvenOdd();
                    break;
                case 3:
                    checkVowel();
                    break;
                case 4:
                    checkDivisibleBy5();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void findGreater() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter number 3: ");
        double num3 = scanner.nextDouble();

        double maxNumber = Math.max(num1, Math.max(num2, num3));
        System.out.println("The greatest number is: " + maxNumber);
    }

    private static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    private static void checkVowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().toLowerCase().charAt(0);

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        boolean isVowel = false;

        for (char vowel : vowels) {
            if (character == vowel) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is not a vowel.");
        }
    }

    private static void checkDivisibleBy5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
    }
}

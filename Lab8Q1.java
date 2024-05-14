import java.util.Scanner;

public class Lab8Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Taj Hotel Reservation System!");
        System.out.println("Available Room Types:");

        // Display the list of room types
        String[] roomTypes = { "luxury", "a/c", "non a/c", "deluxe" };
        int[] roomCosts = { 2500, 2000, 1500, 1800 }; // Assigning a default cost for "deluxe" room

        for (int i = 0; i < roomTypes.length; i++) {
            System.out.println((i + 1) + ". " + roomTypes[i] + " - $" + roomCosts[i] + " per day");
        }

        // Get user input for room type
        System.out.print("Enter the room type number you want to reserve: ");
        int selectedRoomIndex = scanner.nextInt();

        // Validate user input
        if (selectedRoomIndex < 1 || selectedRoomIndex > roomTypes.length) {
            System.out.println("Invalid room type selection. Please try again.");
            return;
        }

        // Get user information
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your PAN number: ");
        String panNumber = scanner.next();

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.next();

        System.out.print("Enter your address: ");
        scanner.nextLine(); // Consume the newline character
        String address = scanner.nextLine();

        // Get user input for the number of days
        System.out.print("Enter the number of days for reservation: ");
        int numOfDays = scanner.nextInt();

        // Calculate total cost
        int totalCost = roomCosts[selectedRoomIndex - 1] * numOfDays;

        // Display reservation details
        System.out.println("\nReservation Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Address: " + address);
        System.out.println("Room Type: " + roomTypes[selectedRoomIndex - 1]);
        System.out.println("Cost per day: $" + roomCosts[selectedRoomIndex - 1]);
        System.out.println("Number of days: " + numOfDays);
        System.out.println("Total Cost: $" + totalCost);

        System.out.println("\nThank you, " + name + ", for choosing Taj Hotel!");
    }
}


/*2.A class teacher has decided to split her entire class into four groups, namely Sapphire, Perl, Ruby, and Emerald for sports competitions. For dividing the students into these four groups, she has followed the pattern given below:
Sapphire - 1, 5, 9, 13, 17, 21, ...
Perl - 2, 6, 10, 14, 18, 22, ...
Ruby - 3, 7, 11, 15, 19, 23, ...
Emerald - 4, 8, 12, 16, 20, 24, ...
All the students are represented by their roll numbers. Based on the above pattern, given the roll number as input, print the group the student belongs to. Note that the roll number can be any positive integer and not necessarily less than 25.
*/
import java.util.Scanner;

public class Lab10q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the roll number of the student: ");
        int rollNumber = scanner.nextInt();
        scanner.close();

        String group = determineGroup(rollNumber);
        System.out.println("The student with roll number " + rollNumber + " belongs to group " + group);
    }

    public static String determineGroup(int rollNumber) {
        int groupSize = 4;
        int[] groupStart = { 1, 2, 3, 4 }; // Starting roll number for each group

        for (int i = 0; i < groupSize; i++) {
            if (rollNumber >= groupStart[i] && (rollNumber - groupStart[i]) % groupSize == 0) {
                switch (i) {
                    case 0:
                        return "Sapphire";
                    case 1:
                        return "Perl";
                    case 2:
                        return "Ruby";
                    case 3:
                        return "Emerald";
                }
            }
        }
        return "Unknown";
    }
}
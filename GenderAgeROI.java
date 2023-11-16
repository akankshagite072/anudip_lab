import java.util.Scanner;

public class GenderAgeROI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = input.nextInt();

        System.out.println("Enter your gender (M/F) :");
        char gender = input.next().charAt(0);

        double roi;

        if (age > 60) {
            if (gender == 'M') {
                roi = 7.0;
            } else if (gender == 'F') {
                roi = 7.5;
            } else {
                System.out.println("Invalid gender");
                return;
            }
        } else {
            if (gender == 'M' || gender == 'F') {
                roi = 5.0;
            } else {
                System.out.println("Invalid gender");
                return;
            }
        }

        System.out.println("The rate of interest (ROI) for you is : " + roi + "%");
    }
}

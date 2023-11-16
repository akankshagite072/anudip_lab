import java.util.*;

public class MenuDrive {

    public static void main(String[] args) {
        int choice, num1, num2, choice2;
        boolean result;
        Scanner input = new Scanner(System.in);
        System.out.println("!!!!! MENU !!!!!");
        System.out.println("1) Arithmatic Operator\n"
                + "2) Logical Operator\n"
                + "3) Relational Operator\n"
                + "4) Conditional Operator\n"
                + "5) Assignment Operator\n"
                + "Enter your choice=");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                // Performing arithmetic operation

                System.out.println("Enter two number=");
                num1 = input.nextInt();
                num2 = input.nextInt();
                // Accepting input

                System.out.println("--*-*- Arithmatic Operator -*-*-*-*");
                System.out.println("******** ADDITION ********");
                System.out.print("Addition=" + (num1 + num2));

                System.out.println("\n******** SUBSTRACTION ********");
                System.out.print("Substraction=" + (num2 - num1));

                System.out.println("\n******** MULTIPLICATION ********");
                System.out.print("Multiplication=" + (num2 * num1));

                System.out.println("\n******** DIVISIION ********");
                System.out.print("Division=" + (num2 / num1));
                break;

            case 2:
                // Performing logical operation

                System.out.println("Enter two number=");
                num1 = input.nextInt();
                num2 = input.nextInt();
                // Accepting input

                System.out.println("num1=" + num1 + "\nnum2=" + num2);
                result = (num1 > num2) && (num1 < num2);

                System.out.println("Result of (num1>num2)&&(num1<num2)=" + result);
                result = (num1 < num2) && (num1 <= num2);

                System.out.println("Result of (num1<num2)&&(num1<=num2)=" + result);
                result = (num1 > num2) || (num1 <= num2);

                System.out.println("Result of (num1>num2)||(num1<=num2)=" + result);
                break;

            case 3:
                // Performing relational operation

                System.out.println("Enter two number=");
                num1 = input.nextInt();
                num2 = input.nextInt();
                // Accepting input

                System.out.println("\n\n--*-*- Relational Operator -*-*-*-*");

                System.out.println("num1=" + num1 + "\nnum2=" + num2);

                System.out.println("Result of (num1>num2)=" + (num1 > num2));

                System.out.println("Result of (num1>=num2)=" + (num1 >= num2));

                System.out.println("Result of (num1<num2)=" + (num1 < num2));

                System.out.println("Result of (num1!=num2)=" + (num1 != num2));
                break;

            case 4:
                // performing conditional operator

                System.out.println("\n\n--*-*- Conditional Opeartor -*-*-*-*");
                System.out.println("Types of conditional Operator\n");

                // List of conditional operator
                System.out.println("1) if\n"
                        + "2) if else\n"
                        + "3) if ifelse else\n"
                        + "4) switch\n"
                        + "Enter your choice=");
                choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Yor are in 'if' condition\n");
                        break;

                    case 2:
                        System.out.println("Yor are in 'if else' condition\n");
                        break;

                    case 3:
                        System.out.println("Yor are in 'if elseif else' condition\n");
                        break;

                    case 4:
                        System.out.println("Yor are in 'switch' condition\n");
                        break;
                }

                break;

            case 5:
                // Performing assignment operation

                System.out.println("Enter two number=");
                num1 = input.nextInt();
                num2 = input.nextInt();
                // Accepting input

                System.out.println("\n\n--*-*- Assignment Opeartor -*-*-*-*");
                System.out.print("'num1' is assign with 10 value");
                num1 += 20;
                System.out.print("\n'num1' is add with 20 and again assign to 'num1'"
                        + " the value=" + num1);

                System.out.print("\n'num2' is assign with 6.3 value");
                num2 *= 2;
                System.out.print("\n'num2' is multiply with 2 and again assign to 'num2'"
                        + " the value=" + num2);
                break;

            default:
                System.out.println("Enter valid choice only");
                input.close();
        }
    }
}

// multiprocessing 
//CoffeeMachine class
package thursday_lab;

public class CoffeeMachine {
    private int cb = 100;

    synchronized void brewCoffee(String user, String coffeeType, int q) {
        System.out.println(user + " ordered " + q + " cups of " + coffeeType + " coffee.");

    }   

    synchronized void refillCoffeeBeans(int q) {
        cb += q;
        System.out.println("Coffee beans refilled. Current quantity: " + cb);
    }
}
//VanillaCoffee class
package thursday_lab;

public class VanillaCoffee extends Thread {
    private CoffeeMachine coffeeMachine;
    private String user;
    private int q;

    public VanillaCoffee(String user, int q, CoffeeMachine cm) {
        super(user + "-v-Thread");
        this.user = user;
        this.q = q;
        this.coffeeMachine = cm;
    }

    
    public void run() {
        coffeeMachine.brewCoffee(user, "v", q);
    }
}
//CappuccinoCoffee class
package thursday_lab;

public class CappuccinoCoffee extends Thread {
    private CoffeeMachine coffeeMachine;
    private String user;
    private int q;

    public CappuccinoCoffee(String user, int q, CoffeeMachine cm) {
        super(user + "-c-Thread");
        this.user = user;
        this.q = q;
        this.coffeeMachine = cm;
    }

    
    public void run() {
        coffeeMachine.brewCoffee(user, "c", q);
    }
}
//IcedLatte class
package thursday_lab;

public class IcedLatte extends Thread {
    private CoffeeMachine coffeeMachine;
    private String user;
    private int q;

    public IcedLatte(String user, int q, CoffeeMachine cm) {
        super(user + "-il-Thread");
        this.user = user;
        this.q = q;
        this.coffeeMachine = cm;
    }

    
    public void run() {
        coffeeMachine.brewCoffee(user, "il", q);
    }
}
// main CoffeeShop class
package thursday_lab;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String user1 = scanner.nextLine();
        System.out.println("Enter the quantity of Vanilla coffee cups: ");
        int q1 = scanner.nextInt();

        scanner.nextLine(); // Consume the newline left by nextInt()
        System.out.println("Enter your name: ");
        String user2 = scanner.nextLine();
        System.out.println("Enter the quantity of Cappuccino coffee cups: ");
        int q2 = scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("Enter your name: ");
        String user3 = scanner.nextLine();
        System.out.println("Enter the quantity of Iced Latte coffee cups: ");
        int q3 = scanner.nextInt();

        VanillaCoffee v = new VanillaCoffee(user1, q1, cm);
        CappuccinoCoffee c = new CappuccinoCoffee(user2, q2, cm);
        IcedLatte il =new IcedLatte(user3, q3, cm);
        // Start the threads
        v.start();
        c.start();
        il.start();
    }
}


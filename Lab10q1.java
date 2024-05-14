
//1.  Define Product class with name, price,  and sort it price wise (use comparable interface) .
import java.util.*;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + ": Rs" + price;
    }
}

public class Lab10q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price:Rs. ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            products.add(new Product(name, price));
        }

        Collections.sort(products);

        System.out.println("\nProducts sorted by price:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
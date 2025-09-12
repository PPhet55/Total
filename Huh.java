import java.util.Scanner;

public class Huh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the product (per unit): ");
        double price = scanner.nextDouble(); 

        System.out.print("Enter the quantity of the product: ");
        int quantity = scanner.nextInt();

       
        double total = price * quantity;

        if (quantity > 10) {
            System.out.println("You get a 10% discount!");
            total = total * 0.9; 
        } else {
            System.out.println("No discount applied.");
        }

        System.out.println("Total price: " + total + " Baht");

        scanner.close();
    }
}

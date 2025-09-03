import java.util.Scanner;

public class Hwtotal { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter product 1 name: ");
        String productName1 = sc.nextLine();
        System.out.print("Enter product 1 price: ");
        float productPrice1 = sc.nextFloat();
        System.out.print("Enter quantity for product 1: ");
        int quantity1 = sc.nextInt();
        sc.nextLine();  

        
        System.out.print("Enter product 2 name: ");
        String productName2 = sc.nextLine();
        System.out.print("Enter product 2 price: ");
        float productPrice2 = sc.nextFloat();
        System.out.print("Enter quantity for product 2: ");
        int quantity2 = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter product 3 name: ");
        String productName3 = sc.nextLine();
        System.out.print("Enter product 3 price: ");
        float productPrice3 = sc.nextFloat();
        System.out.print("Enter quantity for product 3: ");
        int quantity3 = sc.nextInt();
        sc.nextLine(); 

        
        System.out.print("Enter amount paid: ");
        float amountPaid = sc.nextFloat();

      
        float subtotal1 = productPrice1 * quantity1;
        float subtotal2 = productPrice2 * quantity2;
        float subtotal3 = productPrice3 * quantity3;

        float subtotal = subtotal1 + subtotal2 + subtotal3;
        float vat = (7.0f / 100.0f) * subtotal;
        float total = subtotal + vat;
        float change = amountPaid - total;

        
        System.out.println("-------- Receipt --------");
        System.out.println(productName1 + ": " + productPrice1 + " x " + quantity1 + " = " + subtotal1 + " Baht");
        System.out.println(productName2 + ": " + productPrice2 + " x " + quantity2 + " = " + subtotal2 + " Baht");
        System.out.println(productName3 + ": " + productPrice3 + " x " + quantity3 + " = " + subtotal3 + " Baht");

        System.out.println("Subtotal: " + subtotal + " Baht");
        System.out.println("VAT 7%: " + vat + " Baht");
        System.out.println("Total including VAT: " + total + " Baht");
        System.out.println("Amount paid: " + amountPaid + " Baht");
        System.out.println("Change: " + change + " Baht");
    }
}

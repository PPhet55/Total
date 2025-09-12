import java.util.Scanner;

public class Tum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price product: ");
        int pricePerProduct = sc.nextInt();

        System.out.print("Enter number of products: ");
        int num = sc.nextInt();

        int totalAmount = pricePerProduct * num;
        System.out.println("Total amount to pay: " + totalAmount + " baht");

        int customerMoney = 1000;

        if (customerMoney < totalAmount) {
            System.out.println("Not enough money!!");
        } else {
            int change = customerMoney - totalAmount;
            System.out.println("Change is : " + change + " baht");

            int fiveHundred = change / 500;
            change = change % 500;

            int hundred = change / 100;
            change = change % 100;

            int fifty = change / 50;
            change = change % 50;

            int twenty = change / 20;
            change = change % 20;

            int ten = change / 10;
            change = change % 10;

            int five = change / 5;
            change = change % 5;

            int two = change / 2;
            change = change % 2;

            int one = change;

            System.out.println("Five-hundred note: " + fiveHundred + " note(s)");
            System.out.println("Hundred note: " + hundred + " note(s)");
            System.out.println("Fifty note: " + fifty + " note(s)");
            System.out.println("Twenty note: " + twenty + " note(s)");
            System.out.println("Ten coin: " + ten + " coin(s)");
            System.out.println("Five coin: " + five + " coin(s)");
            System.out.println("Two coin: " + two + " coin(s)");
            System.out.println("One coin: " + one + " coin(s)");
        }
    }
}

        
        
        
        
        
     
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("Current > number1 = " + num1 + " and number2 = " + num2);

        
        int num = num1;
        num1 = num2;
        num2 = num;

        System.out.println("Swapping..........");

        System.out.println("Now > number1 = " + num1 + " and number2 = " + num2);
    }
}

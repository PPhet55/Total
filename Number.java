import java.util.Scanner;
public class Number{
    public static void main (String[] arges){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1 =" );
        int number1 = sc.nextInt();
        System.out.print("Enter number2 =" );
        int number2 = sc.nextInt();
       
       int total;
        if (number1 > number2){

             total = number1 - number2;
        }
        else {
              total = number1 + number2;
        }
       System.out.print("Total is = "+total );
    }
}
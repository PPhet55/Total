import java.util.Scanner;
public class Eochack{
    public static void main (String[] arges){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =" );
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
            }
     
        System.out.println("จบโปรแกรม");
    }
}
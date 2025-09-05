import java.util.Scanner;
public class Positive{
    public static void main (String[] arges){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =" );
        int number = sc.nextInt();

        if (number > 0){
            System.out.println("จำนานเต็มบวก");
        }
        
        System.out.println("จบโปรแกรม");
    }
}
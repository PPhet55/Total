import java.util.Scanner;
public class Test{
    public static void main (String[] arges){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yout midterm score =" );
        int point1 = sc.nextInt();
        System.out.print("Enter yout final score =" );
        int point2 = sc.nextInt();

        int total = point1 + point2;

        System.out.println("Your total score is "+total);
        if (total >= 50 ){
            System.out.println("The result is pass");
        }
        else {
            System.out.println("The result is fail");
        }
       
    }
}
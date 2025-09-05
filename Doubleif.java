import java.util.Scanner;
public class Doubleif{
    public static void main (String[] arges){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =" );
        int number = sc.nextInt();

        if (number > 0){
            System.out.println("จำนานเต็มบวก");
        }
        else {
            System.out.println("จำนวนเต็มลบ");
            }
     
        System.out.println("จบโปรแกรม");
    }
}
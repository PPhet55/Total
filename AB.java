import java.util.Scanner;
public class AB{
    public static void main (String[] arges){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1 or 2 =" );
        int number = sc.nextInt();

        if (number == 1){
            System.out.print("Enter base =");
            float base = sc.nextFloat();
            System.out.print("Enter high =");
            float high = sc.nextFloat();
            
            float area = (high*base)*0.5f;
            System.out.println("Area of triangle ="+ area +"squrea units");

        }
        else {
            System.out.print("Enter weight =");
            float weight = sc.nextFloat();
            System.out.print("Enter hight=");
            float hight = sc.nextFloat();
            
            float bmi = weight/(hight*hight);
            System.out.println("Your BMI for weight ="+weight+"your hight "+hight+" is "+bmi);
            }
     
        
    }
}
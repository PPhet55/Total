import java.util.Scanner;
public class Eiei{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product 1 Name = ");
        String productName1 = sc.nextLine();

          System.out.print("Enter product 1 price = ");
        float productprice1 = sc.nextFloat();

         System.out.print("Enter product 2 Name = ");
         String productName1 = sc.nextLine();

          System.out.print("Enter product 2 price = ");
        float productprice2 = sc.nextFloat();

         System.out.print("Enter product 3 Name = ");
         String productName1 = sc.nextLine();

          System.out.print("Enter product 3 price = ");
        float productprice3 = sc.nextFloat();

         System.out.print("Enter money = ");
        float money = sc.nextFloat();
        
         System.out.println("-------- Receipt-------- ");
       
        System.out.println(productName1+":"+productprice1);
        
          System.out.println(productName2+":"+productprice2);

        System.out.println(productName3+":"+productprice3);

        float tbf = productprice1+productprice2+productprice3;

        System.out.println("Total price before tax :"+tbf);
        
        float vat = (7.0/100.0) * tbf ;
        System.out.println("Vat: "+vat);

        float net = tbf + vat;
        System.out.println("Net price : "+net);

        System.out.println("Total paid : "+money);

        float  change = money - net;
        System.out.println("Change : "+money);

            
    }
}
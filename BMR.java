import java.util.Scanner;

public class BMR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your gender (man/woman): ");
        String gender = scanner.nextLine().trim();

    
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age (years): ");
        int age = scanner.nextInt();

        double bmr;

     
      if (gender.equalsIgnoreCase("man")) {
    bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
} else if (gender.equalsIgnoreCase("woman")) {
    bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
} else {
    System.out.println("Invalid gender. Please enter 'man' or 'woman'.");
    return;
}

    
        System.out.printf("Your BMR is: %.2f kilocalories/day\n", bmr);
    }
}

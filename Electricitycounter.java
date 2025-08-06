package Question;
import java.util.*;

public class Electricitycounter {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total electricity units consumed: ");
        int units = sc.nextInt();

        double bill = 0.0;

        if (units <= 50) {
            bill = units * 0.50;
            System.out.println("Total electricity bill: "+ bill);
        } else if (units <= 150) {  
            bill = 50 * 0.50 + (units - 50) * 0.75;
            System.out.println("Total electricity bill:"+ bill);
        } else if (units <= 350) {  
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.25;
            System.out.println("Total electricity bill: "+ bill);
        } else if (units <= 600) {  
            bill = 50 * 0.50 + 100 * 0.75 + 200 * 1.25 + (units - 350) * 1.50;
            System.out.println("Total electricity bill: "+ bill);
        } else {
            System.out.println("Charges not available for units above 600.");
        }

        sc.close();
    }
}



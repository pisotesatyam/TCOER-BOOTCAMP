package Question;
import java.util.*;

public class SquareRoot {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Square root of negative number is not real.");
        } else {
            double sqrt = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + sqrt);
        }

        sc.close();
    }
}



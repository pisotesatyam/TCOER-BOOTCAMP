package Question;
import java.util.*;
public class Triangle {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int side1 = sc.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = sc.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    sc.close();
    }
}
    


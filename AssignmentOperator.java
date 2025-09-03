public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        a += 5; // Same as the a = a + 5
        b -= 5; // Same as the b = b - 5
        c *= 2; // Same as the c = c * 2
        d /= 2; // Same as the d = d / 2

        System.out.println("Value of a after += 5: " + a);
        System.out.println("Value of b after -= 5: " + b);
        System.out.println("Value of c after *= 2: " + c);
        System.out.println("Value of d after /= 2: " + d);
    }
}

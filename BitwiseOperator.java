public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;  // In binary: 0101
        int b = 3;  // In binary: 0011

        int andResult = a & b; // Bitwise AND
        int orResult = a | b;  // Bitwise OR
        int xorResult = a ^ b; // Bitwise XOR
        int notResult = ~a;    // Bitwise NOT
        int leftShiftResult = a << 1; // Left shift
        int rightShiftResult = a >> 1; // Right shift

        System.out.println("Bitwise AND (a & b): " + andResult);
        System.out.println("Bitwise OR (a | b): " + orResult);
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);
        System.out.println("Bitwise NOT (~a): " + notResult);
        System.out.println("Left Shift (a << 1): " + leftShiftResult);
        System.out.println("Right Shift (a >> 1): " + rightShiftResult);
    }
}
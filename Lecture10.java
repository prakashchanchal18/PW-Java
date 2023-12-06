package physicsWallah;

import java.util.Scanner;

public class Lecture10 {
    public static void main(String[] args) {
        // Number Systems | Decimal & Binary

        // Decimal number system
        /*
        - digits used [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        - Base 10
        - (3451) base 10 = 3x10^3 + 4x10^2 + 5x10^1 + 1x10^0
         */

        // Binary number system
        /*
        - digits used [0, 1]
        - Base 2
        - (1001) base 2 = 1x2^3 + 0x2^2 + 0x2^1 + 1x2^0
         */

        // Conversion form binary to decimal number system.
        /*
        - (1001) base 2 = 1x2^3 + 0x2^2 + 0x2^1 + 1x2^0 = 8+0+0+1 = 9 (decimal rep. of 1001)
         */

        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();

        int decimal_ans = 0; // converted decimal number
        int power_2 = 1;
        while(binary_num > 0) {
            int unit = binary_num%10;
            decimal_ans += unit*power_2;
            power_2 *= 2;
            binary_num /= 10;
        }
        System.out.println(decimal_ans);

        // Conversion form decimal to binary number system.
        /*
        - Divide the number by 2 and find parity until the number is not further divisible.
        - form bottom to top parity combination is the binary representation of the decimal number.
         */

        int decimal_num = sc.nextInt();

        int binary_ans = 0; // converted binary number
        int power_10 = 1;
        while(decimal_num > 0) {
            int parity = decimal_num%2;
            binary_ans += parity*power_10;
            power_10 *= 10;
            decimal_num /= 2;
        }
        System.out.println(binary_ans);
    }
}

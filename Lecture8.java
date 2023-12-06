package physicsWallah;

import java.util.Scanner;

public class Lecture8 {
    public static void main(String[] args) {
        // Problems related to loops part - 1

        // Count the number of digits for a given number n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while(n > 0) {
            count++;
            n = n/10;
        }
        System.out.println(count);

        // Find the sum of digits in a given number

        int m = sc.nextInt();

        int sum = 0;
        while(m>0) {
            int temp = m%10;
            sum += temp;
            m = m/10;
        }
        System.out.println(sum);

        // Reverse the digit of a given number

        int p = sc.nextInt();

        int rev = 0;
        while(p > 0) {
            int temp = p%10;
            rev = rev*10 + temp;
            p = p/10;
        }
        System.out.println(rev);

        // Find the sum of the following series
        // S = 1 - 2 + 3 - 4 + 5 - 6..... n

        int q = sc.nextInt();

        int i = 1;
        int seriesSum = 0;
        while(i <= q) {
            if(i%2 != 0) {
                seriesSum += i;
            }
            else {
                seriesSum -= i;
            }
            i++;
        }
        System.out.println(seriesSum);

        // Print the first n factorial

        int num = sc.nextInt();

        int fact = 1;
        while(num > 0) {
            fact = fact*num;
            num--;
        }
        System.out.println(fact);

        // Given 2 number a and b. Find a raise to the power b.

        int a = sc.nextInt();
        int b = sc.nextInt();

        int pow = 1;
        System.out.println(Math.pow(a,b));
        while(b > 0) {
            pow = pow*a;
            b--;
        }
        System.out.println(pow);
    }
}

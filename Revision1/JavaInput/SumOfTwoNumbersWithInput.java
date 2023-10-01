package physicsWallah.Revision1.JavaInput;

import java.util.Scanner;
public class SumOfTwoNumbersWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter value of y : ");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println(x+y);
        System.out.println("Sum of x and y is : " + sum);
    }
}

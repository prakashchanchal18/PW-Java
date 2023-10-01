package physicsWallah.Revision1.JavaInput;

import java.util.Scanner;
public class FindRemainderWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter value of y : ");
        int y = sc.nextInt();
        int remainder = x%y;
        System.out.println("Remainder when x is divided by y : " + remainder);
    }
}

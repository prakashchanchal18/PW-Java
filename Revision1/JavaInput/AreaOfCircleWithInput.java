package physicsWallah.Revision1.JavaInput;

import java.util.Scanner;
public class AreaOfCircleWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 5;
        double pi = 3.14159265359;
        double area = pi*radius*radius;
        System.out.println("Area of circle is " + area);

        System.out.print("Enter radius ");
        double r = sc.nextDouble();
        area = pi*r*r;
        System.out.print("Area of circle is " + area);
    }
}

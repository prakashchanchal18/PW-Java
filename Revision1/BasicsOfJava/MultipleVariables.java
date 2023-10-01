package physicsWallah.Revision1.BasicsOfJava;

public class MultipleVariables {
    public static void main(String[] args) {
        int x = 5, y = 8, z = 9;
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of z is " + z);
        z = 25;
        System.out.println(x+y+z);
        System.out.println(" " + x + y + z); // output - 5825
        System.out.println(x+ " " + y + z); // output - 5825
        System.out.println(x+y+" "+z); // output - sum is 1325
        System.out.println("sum is " + x+y+z); // output - sum is 5825
        // Computer check from left to right, so if the first part is string, another part will also act as string.

        System.out.println("sum is " + (x+y+z)); //
    }
}

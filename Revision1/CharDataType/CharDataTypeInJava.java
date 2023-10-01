package physicsWallah.Revision1.CharDataType;

import java.util.Scanner;

public class CharDataTypeInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.println(ch);
        int x = (int)ch; // typecasting
        System.out.println(x);

        char c = sc.next().charAt(0);
        System.out.print(c);
    }
}

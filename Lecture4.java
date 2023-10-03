package physicsWallah;

import java.util.Scanner;

public class Lecture4 {
    public static void main(String[] args) {
        // Scanner class
        // It is a class provided by java to take input.
        // It is inside java.util package.
        // Package is a collection of classes and interfaces, etc. which can be imported in a java file.

        // Class: user-defined blueprint with some attributes and methods.
        // Object: Instance of a class.
        // Syntax: className objectName = new className(parameters);
        // parameters are like name, color, etc.

        // For example, in class Car example BMW - attribute - name, methods - drive
        // BMW.name; - This is how we call an attribute.
        // BMW.drive(); - This is how we call a method.

        // Object of scanner class
        Scanner sc = new Scanner(System.in);
        // System.in - used for STDIN.
        // System.out - used for STDOUT.

        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Entered number is: " + num1);

        System.out.println("Enter your name");
        String name = sc.next(); // next method doesn't read anything after white-space.
       System.out.println("Your name is: " + name);

        System.out.println("Enter your full name");
        String full_name = sc.nextLine();
        System.out.println("Your name is: " + full_name);

        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num2 + num3;
        System.out.println(sum);

        System.out.print("Enter principal: ");
        float p = sc.nextFloat();
        System.out.print("Enter rate: ");
        float r = sc.nextFloat();
        System.out.print("Enter time: ");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("Simple interest is: " + si);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.print("you entered: " + ch);

        /*
        MCQs

        1. What is the output of the following code, if input is: 20 physics wallah
            Scanners = new Scanner(System.in);
            int p = s.nextInt();
            String q = s.next();
            System.out.print(p);
            System.out.println(q);

            a) 20 physics wallah
            b) 20physics (Ans)
            c) 20physics wallah
            d) 20 physics

         2. What is the output of the following code, if input is: hello world 21
         Scanner sc = new Scanner(System.in);
         String p = sc.next();
         int q = sc.nextInt();
         System.out.print(p +"" +q);

         a) hello world 21
         b) InputMismatchException (Ans)
         c) Hello 21
         d) Hello
         */
    }
}

package physicsWallah;

public class Lecture3 {

        // Everything in java is written in classes.
        // Class - It is a user-defined blueprint consisting of attributes and methods/functions.
        // Object - Instance of that class.
        // Class - car
        // Attributes - Company, color, price etc..
        // Methods - Run(), Open_Gate(), Open_Trunk() etc..
        // Instance - BMW, Audi, Mercedes etc..
        // For example - To access the color of a BMW car, we will write BMW.color
        // Similarly - Audi.Open_Gate(), Mercedes.Company, BMW.Open_Trunk() etc..

        // Functions - A block of code that can be called anywhere in the program.
        // Function syntax -
        // public static int addTwoNum(int a, int b) { return a+b; }

    public static void main(String[] args) {
        // public static void main(String[] args)
        // public - access modifier
        // static - allows to call this method without creating an object of class
        // void - return type
        // main - function name (entry point of a java program)
        // String[] args - command line argument
        // [] - represent list
        // args - name of list it can be anything

        System.out.println("Hello world");
        // System.out.println(args[0]);
        // System.out.println(args[1]);

        // system - It's a class which is available in every file of java to be used, provide standard input and output.
        // out - It's an object of class called Print Stream.
        // println - Method in Print Stream class.

        // Java Variables - Title of reserved memory locations
        // Syntax - Type variable_name = value;
        int money = 1000;
        String name = "Prakash";
        System.out.println(money); // semicolon (;) act as a terminator.
        System.out.println(name);

        // Java Naming Conventions
        // 1. Lowercase - name, salary, a, value, result ...
        // 2. Uppercase - Name, SALARY, A, VALUE, RESULT ...
        // 3. Camelcase - studentName, moneyBorrowed, totalIncome ...
        // 4. Pascale case - java classes are written in pascale case (CollegeWallah, StudentName, PrimeNumber ...)
        // packages are written in lowercase.
        // Constant value are written in s
    }
}

package physicsWallah;

public class Lecture3 {

        // Everything in java is written in classes.
        // Class - It is a user-defined blueprint consisting of attributes and methods/functions.
        // Object - Instance of that class.
        // Class - car
        // Attributes - Company, color, price etc..
        // Methods - Run(), Open_Gate(), Open_Trunk() etc..
        // Instance - BMW, Audi, Mercedes etc.
        // For example - To access the color of a BMW car, we will write BMW.color
        // Similarly - Audi.Open_Gate(), Mercedes.Company, BMW.Open_Trunk() etc..

        // Functions - A block of code that can be called anywhere in the program.
        // Function syntax -
        // public static int addTwoNum(int a, int b) { return (a+b); }

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
        // Syntax - Data Type variable_name = value;
        int money = 1000;
        String name = "Prakash";
        System.out.println(money); // semicolon (;) act as a terminator.
        System.out.println(name);

        // Java Naming Conventions
        // 1. Lowercase - name, salary, a, value, result ...
        // 2. Uppercase - NAME, SALARY, A, VALUE, RESULT ...
        // 3. Camelcase - Java functions and variable are written in Camelcase - (studentName, myTotalIncome)
        // 4. Pascale Case-Java classes are written in pascale case -(CollegeWallah StudentName, PrimeNumber)

        // Packages are written in lowercase.
        // Snake-case - college_wallah
        // Constant value is written in Upper Snake-case - e.g., MIN_CAPACITY
        // Upper Snake-case is also known as Screening Snake-case

        // Rules for Naming Variables in Java
        // Rule 1- Variable names should not begin with a number.
        // Rule 2- White-space is not permitted in variable names.
        // Rule 3- A Java keyword (reserved word) cannot be used as a variable name.
        // Rule 4- It is preferred to use variable names with more than one word with all lowercase letters
        //         for the first word and capitalization of the first letter of each subsequent word.
        // Rule 5- When creating variables, it is preferred to give them meaningful names.
        // Rule 6- All lowercase letters should be used when creating one-word variable names.

        /*
        Java Identifiers - Name for any component in java.

    -- Points to remember about Identifiers

     Rule 1- All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore(_).
     Rule 2- After the first character, identifiers can have any combination of characters.
     Rule 3- A keyword cannot be used as an identifier.
     Rule 4- The identifiers are case-sensitive.
     Rule 5- White-space is not permitted.
         */

        /*
        Java Data Types

        - Primitive Data Types: Build-in data types, holds single value, cannot be divided.
            1. Boolean - Values: True or false
                       - Declare: boolean check = true;

            2. Byte - Size: One byte or eight bits
                    - Range: -2^7 to 2^7-1
                    - Declare: byte b = 100;

            3. Short - Size: 2 bytes or 16 bits
                     - Range: -2^15 to 2^15-1
                     - Declare: short s = 7771;

            4. int - Size: 4 bytes or 32 bits
                     - Range: -2^31 to 2^31-1 (0th bit is reserved for sign)
                     - Declare: int roll = 21;

            5. long - Size: 8 bytes or 64 bits
                     - Range: -2^64 to 2^64-1 (0th bit is reserved for sign)
                     - Declares: long mobile = 8899888;

            6. float - Size: 4 bytes or 32 bits
                     - Declare: float pi = 3.1434;

            7. double - Size: 8 bytes or 64 bits
                      - Declare: double value = 2.32323232;

            8. char - Size: 2 bytes or 16 bits
                      - Declare: char ch = 'P';

        - Non-primitive Data Types: User defined, holds memory address of a variable, complex structure can be divided.
            1. String
            2. Array
            3. Classes
            4. Interfaces
         */

        boolean flag = true;
        int a = 12345;
        short s = 1200;
        byte b = 120;
        long l = 832786310;
        float f = 800.7692f;
        double d = 7878.8765;
        char ch = 'p';

        System.out.println("The boolean variable is " + flag);
        System.out.println("The integer variable is " + a);
        System.out.println("The short variable is " + s);
        System.out.println("The byte variable is " + b);
        System.out.println("The long variable is " + l);
        System.out.println("The float variable is " + f);
        System.out.println("The double variable is " + d);
        System.out.println("The char variable is " + ch);

        /*
        MCQ

        1. The compiler assigns a default value to an uninitialized local variable in Java Programming.
            Whether this statement is true or false?
            A) True
            B) False (Ans)

        2. Which of the following data types can store the longest decimal number?
            A) boolean
            B) double (Ans)
            C) Float
            D) Long

        3. Which of the following cannot be stored in character data type?
            A) Special symbols
            B) Letter
            C) String (Ans)
            D) Digit
         */
    }
}

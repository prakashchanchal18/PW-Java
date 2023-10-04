package physicsWallah;

import java.util.Scanner;

public class Lecture6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // conditional Statement
        /*
        1. if-else statement
            if(condition) {
            // code
            }
            else {
            // code
            }
         */
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        /*
        2. if else-if statement
            if(condition) {
            // code
            }
            else if() {
            // code
            }
            else {
            // code
            }
         */
        int age = sc.nextInt();
        if(age<=12) {
            System.out.println("child");
        }
        else if(age>12 && age<18){
            System.out.println("teen");
        }
        else {
            System.out.println("adult");
        }

        /*
        3. Nested if-else statement
            if(condition) {
                if(condition) {
                    // code
                }
                else {
                    // code
                }
            }
            else {
            // code
            }
         */

        // Conditional Operators
        // 1. Logical-AND Operator (&&)
        // 2. Logical-OR Operator (||)
        // 3. Ternary Operator (syntax: result = (condition1) ? ans1 : ans2;
        String result;
        result = (num%2==0) ? "even" : "odd";
        System.out.println(result);

        int value1 = sc.nextInt();
        if(value1%2==0 && value1%3==0) {
            System.out.println("Found answer: " + value1);
        }
        int value2 = sc.nextInt();
        if(value2%3==0 || value2%5==0) {
            System.out.println("Found answer: " + value2);
        }

        /*
        3. Switch-case statement
            switch (expression) {
                case x:
                  // code
                  break;
                case y:
                  // code
                  break;
                default:
                  // code
             }
         */

        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }

        /*
            MCQs -
                1. What is the output of the following snippet?
                    int x = 60, y = 90;
                    if (y % x == 0)
                        System.out.println("Good");
                    else
                        System.out.println("Bad");

                        a. Good
                        b. Bad (Ans)
                        c. Compilation error
                        d. None

                 2. What is the output of the following snippet?
                    int x = 60, y = 90;
                    if （y%x==10）
                        System.out.println("Good");
                    else if (y - x == 30)
                        System.out.println("Neutral");
                    else
                        System.out.println("Bad");

                    a. Good
                    b. Bad
                    c. Compilation error
                    d. None (Ans)

                  3. What is the output of the following snippet?
                  int x = 60, y = 90;
                  if (у*x== 540 && x+y== 150)
                    System.out.println("Good");
                  else
                    System.out.println("Bad");

                  a. Good
                  b. Bad (Ans)
                  c. Compilation error
                  d. None

                  4. What is the output of the following snippet?
                  int x = 60, y = 90;
                  if (у*x== 540 || x+y== 150)
                    System.out.println("Good");
                  else
                    System.out.println("Bad");

                  a. Good (Ans)
                  b. Bad
                  c. Compilation error
                  d. None

                  5. What is the output of the following snippet?
                  int course = 2;
                  switch (course) {
                    case 1:
                        System.out.print("java");
                    case 2:
                        System.out.print("python");
                    default:
                        System.out.print("cpp");
                    }

                    a. java
                    b. python (Ans)
                    с. срр
                    d. None
         */
    }
}

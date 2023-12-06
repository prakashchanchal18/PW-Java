package physicsWallah;

import java.util.Scanner;

public class Lecture7 {
    public static void main(String[] args) {
        // Types of Loops in Java
        // 1. While Loop
        /*
            while(condition) {
            ---  code  ---
            }
         */

        // 2. For Loop
        /*
            for (initialize, condition, increment) {
            --- code  ---
            }
         */

        // 3. Do-While Loop
        // Imp - 1st Iteration in do-while loop will always occur.
        /*
            do() {
            --- code ---
            }
            while()
         */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        while(num <= n) {
            System.out.println(num);
            num++; // postfix increment operator same as (num = num+1)
        }
        System.out.println();

        int number = 1;
        int sum = 0;
        while(number <= n) {
            sum = sum+number;
            number++; // postfix increment operator same as (number = number+1)
        }
        System.out.println(sum);
        System.out.println();

        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
        System.out.println();

        for(int i=1; i<=n; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
        System.out.println();

        int digit = 1;
        do{
            System.out.println(digit);
            digit++;
        }
        while(digit <= n);

        // Break Keyword
        // -- Used to stop any condition in the middle.

        // Q. -- Print the first multiple of 5 which is also a multiple of 7
        for(int i=1; ; i++) {
            if(i%5 == 0 && i%7==0) {
                System.out.println(i);
                break;
            }
        }
        int div = 1;
        while(true) {
            if(div%5 == 0 && div%7==0) {
                System.out.println(div);
                break;
            }
            div++;
        }

        // Continue Keyword
        // -- Stops current iteration but the next iteration runs

        // Q. -- Print all the values between 1 and 50 except the multiple of 3.
        for(int i=1; i<=50; i++) {
            if(i%3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        int m = 1;
        while(m <= 50) {
            if(m%3 == 0) {
                m++;
                continue;
            }
            System.out.println(m);
            m++;
        }


        // Using labels with continue and break keyword.
        outer : for(int i=1; i<=n; i++) {
            inner : for(int j=0; j<=n; j++) {
                if(i == 2) {
                    break outer;
                }
            }
        }

        // MCQ

        /*Q. What is the output of the following code snippet?
            for (int i = 1; i ‹ 5; i++) {
                System.out.print(i + ",");
            }

            a. 1,2,3,4, (Ans)
            b. 1,2,3,4
            c. 1,2,3,4,5
            d. None
        */

        /*Q. What is the output of the following snippet?
            int a = 1;
            while (a ‹ 4) {
                System.out.print(a + " ");
                a++;
            }

            a. 1 2 3 4
            b. 1 2 3 (Ans)
            с. 6
            d. Compiler Error
         */
    }
}

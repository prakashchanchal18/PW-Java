package physicsWallah;

public class Lecture9 {
    public static void main(String[] args) {
        // Problems related to loops part - 2

        // Nested Loops - Loops inside a loop is called a nested loops. (Outer loop and inner loop)

        for(int i=1; i<= 3; i++) {              // Outer Loop
            for (int j = 1; j <= 3; j++) {       // Inner Loop
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        // Print the following rectangular pattern.
        /*  ******
            ******
            ******
         */

        for(int i=1; i<=3; i++) {
            for(int j=1; j<=6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Print the following rectangular pattern.
        /*  ******
            *    *
            *    *
            ******
         */

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=6; j++) {
                if(i == 1 || j == 1 || i == 4 || j == 6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Print the following Triangular pattern.
        /*  *
            **
            ***
            ****
         */

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Print the following Triangular pattern.
        /*  ****
            ***
            **
            *
         */

        for(int i=1; i<=4; i++) {
            for(int j=4; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Print the following Pyramid pattern.
        /*     *
              ***
             *****
            *******
         */

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=7; j++) {
                if((i+j) < 5) {
                    System.out.print(" ");
                }
                else if(j > i+3) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Print the following numerical rectangular pattern.
        /*   1 2 3 4 5 6 7
             2 3 4 5 6 7 1
             3 4 5 6 7 1 2
             4 5 6 7 1 2 3
             5 6 7 1 2 3 4
             6 7 1 2 3 4 5
             7 1 2 3 4 5 6
         */

        for(int i=1; i<=7; i++) {
            for(int j=i; j<=7; j++) {
                System.out.print(j + " ");
            }
            for(int k=1; k<=i-1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Print the following numerical rectangular pattern.
        /*   1234567
             1234567
             1234567
             1234567
         */

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=7; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // Print the following numerical rectangular pattern.
        /*   121212
             212121
             121212
             212121
         */

        int a = 1;
        int b = 2;
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=3; j++) {
                if(i%2 != 0) {
                    System.out.print(12);
                }
                else {
                    System.out.print(21);
                }
            }
            System.out.println();
        }
        System.out.println();

        // Print the following numerical triangular pattern.
        /*   1
             12
             123
             1234
         */

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // Print the following numerical pyramid pattern.
        /*      1
               121
              12321
             1234321
         */

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print(k);
            }
            for(int l=i-1; l>=1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println();

        // Print the following numerical pyramid pattern.
        /*      1
               2 2
              3   3
             4444444
         */

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=7; j++) {
                if((i+j) == 5 || j == i+3) {
                    System.out.print(i);
                }
                else if(i == 4) {
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

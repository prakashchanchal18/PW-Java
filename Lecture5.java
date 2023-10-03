package physicsWallah;

public class Lecture5 {
    public static void main(String[] args) {

        // Operators in Java
        // 3+7 = 10 (3, 7 are operands and + is operator and 10 is results)
    /*
        1. Arithmetic Operations
            - Addition (+)
            - Subtraction (-)
            - Multiplication (*)
            - Division (/)
            - Modulus (%)
            - Increment (++)
            - Decrement (--)
    */
        int p = 20;
        int q = 12;
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        System.out.println(p%q);
        System.out.println(++p);
        System.out.println(--q);

    /*
        2. Relational Operations
            - Is Equals to (==)
            - Not Equals to (!=)
            - Greater than (>)
            - Less than (<)
            - Greater than or equal to (>=)
            - Less than or equal to (<=)
    */
        int a = 20;
        int b = 12;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

    /*
        3. Logical Operations
            - Logical AND (&&)
            - Logical OR (||)
            - Logical NOT (!)
    */
        int x = 20;
        int y = 12;
        int z = 9;
        System.out.println((x>y) && (y>z));
        System.out.println((x>y) || (y>z));
        System.out.println(!(x==y));

    /*
        4. Assignment Operations
            - (=)
            - (+=)
            - (-=)
            - (/=)
            - (%=)
    */
        int c = 19;
        int d = c;
        System.out.println(c);

        c += d;
        System.out.println(c);

        c -= d;
        System.out.println(c);

        c *= d;
        System.out.println(c);

        c /= d;
        System.out.println(c);

        c %= d;
        System.out.println(c);

    /*
        5. Unary Operations
            - Unary plus (+) e.g. +10, +71 etc
            - Unary minus (-) e.g. -22, -5 etc
            - Increment operator (++)
            - Decrement operator (--)
            - Logical complement operator (!)
    */
        int s = -19;
        int t = +22;
        System.out.println(s);
        System.out.println(t);

        // Increment operator (++)
        // 1. post-Increment operator (i++) -- First Assign than Increment.
        int u = 12;
        System.out.println(u++);
        // 2. pre-Increment operator (++i) -- First Increment than Assign.
        int v = 2;
        System.out.println(++v);

        // Decrement operator (--)
        // 1. post-Decrement operator (i--) -- First Assign than Decrement.
        int w = 7;
        System.out.println(w--);
        // 2. pre-Decrement operator (--i) -- First Decrement than Assign.
        int k = 2;
        System.out.println(--k);

    /*
        Java operators precedence (power of operator) and associativity (left to right or right to left).

        // Refer precedence_associativity screenshot.
    */

    /*
        MCQs

        1. Let say we have 4 variables of type int; p,q,r,s.
            s=p-++r-++q
            s equivalent to?    Ans: s = p-(++r)-(++s)

        2. What does the following code fragment print?
            System.out.println( 4 + 2 + "pqr"); Ans: 6pqr
            System.out.println("pqr" + 4 + 2);  Ans: pqr42

        3. What is the result of the following code fragment?
            Boolean p = false;
            Boolean q = false;
            Boolean r = true;
            System.out.println (p==q==r);   Ans: true
    */

    /*
        6. Java Bitwise Operators
            - Bitwise OR (|)
                E.g. - 9 = (1001) and 10 = (1010) now 9|10 = (1001 | 1010) = (1011) = 11

            - Bitwise AND (&)
                E.g. - 9 = (1001) and 10 = (1010) now 9&10 = (1001 | 1010) = (1000) = 8

            - Bitwise exclusive OR (^)
                - if both bits are same it will return 0 and if both bits are different it will return 1.
                E.g. - 9 = (1001) and 10 = (1010) now 9^10 = (1001 | 1010) = (0011) = 3

            - Bitwise Complement (~) tilde
                - It inverts all the bits.
                E.g. - 9 = (1001) then ~9 = (0110) = 6

            - Left Shift (<<)
                - It needs two parameters (num << no. of left shift).
                - a << b = a*2^b
                E.g. - 9 = (1001) then 9<<1 = (10010) = 18, 9<<2 = (100100) = 36

            - Right Shift (>>)
                - It needs two parameters (num >> no. of right shift).
                - a >> b = a/2^b
                E.g. - 9 = (1001) then 9>>1 = (100) = 4, 9>>2 = (10) = 2
    */
        int g = 9;
        int h = 10;
        System.out.println(g | h);
        System.out.println(g & h);
        System.out.println(g ^ h);
        System.out.println(~g);
        System.out.println(g << 1);
        System.out.println(g << 2);
        System.out.println(g >> 1);
        System.out.println(g >> 2);

    }
}

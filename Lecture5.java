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
    }
}

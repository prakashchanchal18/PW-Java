package physicsWallah.Revision1.BasicsOfJava;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = x+1;
        System.out.println(x);
        x = x-1;
        System.out.println(x);

        x = 10;
        // pre-increment
        ++x; // increment the value of x by 1
        System.out.println(x);
        --x; // decrement the value of x by 1
        System.out.println(x);

        x = 10;
        // post-increment
        // x++; increment the value of x by 1
        System.out.println(x++);
        System.out.println(x);
        // x--; decrement the value of x by 1
        System.out.println(x--);
        System.out.println(x);



        // Comments in Java
        // Computer will not read this line.
        // This is called a single line comment.
        /*
        This is called multi line comment.
         */

    }
}

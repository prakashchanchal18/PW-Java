package physicsWallah.Revision1.HierarchyOfOperators;

public class CheckHierarchyInJava {
    public static void main(String[] args) {
        int i=2, j=3, k, l;
        double a, b;
        k = i/j*j;
        l = j/i*i;
        a = i/j*j;
        b = j/i*i;
        System.out.println("k = "+ k +", l = "+ l +", a = "+ a +", b = "+ b);

        // Order of Hierarchy in Java
        // Bracket -- Order -- (%,*,/) -- (+,-)
    }
}

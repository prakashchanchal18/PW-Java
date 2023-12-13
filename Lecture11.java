package physicsWallah;

class Person {
    int age = 24;
}

class Students {
    int rollNo;
    String StudentName;
}

public class Lecture11 {
    public static void main(String[] args) {
        // Introduction to OOPs | Classes and Objects

        // OOPs: It is a programming paradigms based on the concept of objects.
        // Objects : Real world entity.

        // Classes : Blueprint or template of real world entity
        // E.g. - Class - Car and, Objects - Toyota, BMW, Audi
        // - Therefore Objects are called as instances of class.

        // E.g. - Class - Car
        //        Class attributes/Member Variables - Model No. YOM, Company, Colour, etc.
        //        Class methods - Accelerate, Break, Steer, etc.

        // Characteristics of an Object
        // 1. Identity - Unique Name - BMW, Toyota
        // 2. State - Attribute - Colour, Model No.
        // 3. Behaviour - Methods - accelerate, Break, Steer, etc.

        // Create a class
        // 1. Access Modifier - It specifies the accessibility of a class (public, private, protected, default)
        // 2. Class Keyword - use class keyword without caps.
        // 3. Class Name
        // 4. Body Name

        /*
            public class Car {
                Body
            }
         */

        // Access Modifier - can be used before any class, methods, field, variable etc.
        // 1. public - Accessible by everyone
        // 2. private - Accessible within the defined bounded region where applied.
        // 3. protected - Can be accessible by parent anb child.
        // 4. default - When no access modifier is declared than automatically default modifier is used.


        // Create an Object
        // Syntax - ClassName ObjectName = new ClassName();

        // To access object's attribute we use "." operator.
        // Syntax - ObjectName.attribute();
        // E.g. - Prakash.age();

        Person Prakash = new Person();
        System.out.println(Prakash.age);

        Students Object1 = new Students();
        Object1.rollNo = 22;
        Object1.StudentName = "Prakash";
        System.out.println(Object1.rollNo);
        System.out.println(Object1.StudentName);

        // MCQs
        /*
        1. What of the operators is used to allocate memory for an object in Java?
            A. Malloc
            B. Alloc
            C. New (Ans)
            D. Realloc

        2. Select the incorrect statement :
            A. OOPS refers to using objects in programming.
            B. A class is a user defined blueprint from which objects are created.
            C. Objects of the same class have different properties. (Ans)
            D. Object is an instance of a class.

        3. Which of the following methods can be used to create an Object of Player class?
            A. Player p1 = new Player;
            B. Player pl:
            C. Player p1 = new Player(); (Ans)
            D. Player p1=0 :

        4. Which line of the following code would give an error?
            class Student {
                int rollNo;
                String name;
            }
            class Demo {
                public static void main (string[] args) {
                    Students s = new Student(); //Line 1
                    rollNo = 10; //Line2 (Will give an error as this field is outside Student class)
                    s.name="Ram" //Line3
                }
            }

        5. Creating an object from a class is known as?
            A. Initializing
            B. Instantiating (Ans)
            C. Interfacing
            D. None of the above
         */
    }
}

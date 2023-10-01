package physicsWallah;

public class Lecture1 {
    public static void main(String[] args) {
        /*
        1. What is programming?
        Ans: - Set of instruction is called a program, and this whole process is called programming.
        Ans: - Programming is the process of providing a set of instructions to a computer to perform any task.
        */

        /*
        2. What are Data Structures?
        Ans: A data structure is a specialized format for organizing, processing, retrieving and storing data.
        Data Structure and Algorithm (DSA) --> Foundational block of a big building called programming.
         */

        /*
        3. What is the application of programming?
        Ans: - Higher level languages --> Translator --> Machine level language
        --> Translator
            1. Compiler -- scan whole code at once
            2. Interpreter -- scan code line by line
            - Syntax checking is also happening alongside Translator.
         */

        /*
        4. Few types of programming paradigms (a typical example or pattern of something; a pattern or model.).
        Ans: - programming paradigms are of three types
                1. Procedural programming.(Set of procedure known as function or subroutine)
                Ex: - C, Basic, Pascal
                2. Functional programming.(pure function)
                Ex: - JavaScript, Python
                    - Pure Function: Pure Functions are the function that follows these two properties
                         1. They follow strict control flow.
                         2. They do not change any external factor.
                3. Object-Oriented programming.(objects and classes)
                Ex: - Java, C++
                    -In Object-Oriented Programming Paradigms data is organised in the form of classes and object
                      rather than function and procedure.
         */

        /*
         5. Some features of java language.
            - Java is a class-based object-oriented programming language.
            - James Gosling -- 1995 (Later acquired by oORACLE).
            - Java is object-oriented and platform independent.
            - Java is simple and secure.
            - Java has a large standard library.
         */

        /*
        6. What is the architecture of java?
            - JDK (Java Development Kit)
                - javac, debugging tool, javadoc, monitoring tool.
                - JDK = JRE + Development tools.

            - JRE (Java Runtime Environment)
                - JRE = JVM + Runtime Libraries.

            - JVM (Java Virtual Machine)
                - Class Loader: It is responsible for loading byte code into main memory.
                - Memory Area: Memory is allocated in this area.
                - Execution Engine: It contains Interpreter + JIT(Just In Time) Compiler + GC(Garbage Collector).
                    - Byte Code(.class) --> Interpreter(JVM) --> Machine code
                    - JIT(Just In Time) Compiler is used to optimize JVM performance.
                    - GC(Garbage Collector) is responsible for automatically deallocating or deferring unused memory.

            - Source Code(.java)--> Compiler --> Byte Code(.class) --> Interpreter(JVM) --> Machine code
            - Java compiler is known as javac.
            - Java is machine independent, but JVM is machine dependent.
         */
    }
}

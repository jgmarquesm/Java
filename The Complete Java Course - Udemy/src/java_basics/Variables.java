package java_basics;

public class Variables {

    public static void main(String[] args) {

        /*
        It's called 'variable' because its value can vary.
        We must to declare a variable before uses it.
        There are too much types of Data in Java.
        When we have doubt about the type of a variable, we can use de keyword 'var'.
        We can create a lot of variables of any Data type we need, eg.: Primitives, Wrappers
        or an object of anyother Java class.
        There are 8 types of Primitive Data Structures.
        Is important to say that Wrappers are a Class representations for Primitives types.
        */

        var xVar = 4;

        // Primitives
        byte x1 = 1; // 1 byte numeric(integer) data structure.
        short x2 = 2; // 2 bytes numeric(integer) data structure.
        int x3 = 3; // 4 bytes numeric(integer) data structure.
        long x4 = 4L; // 8 bytes numeric(integer) data structure.
        float x5 = 5F; // 4 bytes numeric(floating point) data structure.
        double x6 = 6D; // 8 bytes numeric(floating) data structure.
        char x7 = '7'; // Only one character.
        boolean x8 = true; // true or false only.

        /*
        x1 in [-128, 127];
        x2 in [-32768, 32767];
        x3 in [-2147483648, 2147483647];
        x4 in [-9,223,372,036,854,775,808, 9_223_372_036_854_775_807];
        x5: Minimum value = 1.175494351E-38, Maximum value = 3.402823466E+38;
        x6: Minimum value = 2.2250738585072014E-308, Maximum value = 1.7976931348623158E+308;
        - We can use 'underline' to separate the decimals.
        */

        /*
        We can assign a value to a variable at same time of declaring it - Literal Way.
        Also, it's possible declare a variable and only uses it when we need.
        */

        // Declaring
        String xString;

        // Assigning
        xString = "x9";

        System.out.printf("This is a byte: %d.%n", x1);
        System.out.printf("This is a short: %d.%n", x2);
        System.out.printf("This is a int: %d.%n", x3);
        System.out.printf("This is a long: %d.%n", x4);
        System.out.printf("This is a float: %.7f.%n", x5);
        System.out.printf("This is a double: %.16f.%n", x6);
        System.out.printf("This is a char: %s.%n", x7);
        System.out.printf("This is a boolean: %s.%n", x8);
        System.out.printf("This is a String: %s.%n", xString);
    }
}

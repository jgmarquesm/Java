package java_basics;

import examplepackage.TryToUsePrivateClass;

public class LearningMethods {

    // Learning how methods work...
    // The only method that can be executed is the main method, and all the other are just
    // auxiliaries methods that can only be used;

    public static void main(String[] args) {

        // Using method printStrings from other Class
        MyUtils.printStrings("My name is João.");

        // Using method printNumbers from other Class
        double floatingSum = MyUtils.floatingSoma(3.14159, 2.71828);
        double floatingSum2 = MyUtils.floatingSoma(3.0, 2.0);
        int integerSum = MyUtils.integerSoma(3, 2);

        MyUtils.printStrings("3.14159 + 2.71828 =");
        MyUtils.printNumbers(floatingSum);

        MyUtils.printStrings("3.0 + 2.0=");
        MyUtils.printNumbers(floatingSum2);

        MyUtils.printStrings("3 + 2 =");
        MyUtils.printNumbers(integerSum);

        // Even using the same methods above we have differents type of Data, but it is just
        // possible because the method can deal with both types (decimal and floating).

        // Acessing private a class
        PrivateExample.doSomething();
        TryToUsePrivateClass.doSomething();

        // Non-Static method
        // Below we are creating a object of MyUtils
        MyUtils testString = new MyUtils();
        // Here we're using the method in our instance
        String newString = testString.nonStaticExemple("Helo");
        System.out.println(newString);
    }
}

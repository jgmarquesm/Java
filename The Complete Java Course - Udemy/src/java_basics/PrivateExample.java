package java_basics;

class PrivateExample {

    // This class can be acessed by the others classes from the same package, but not
    // to classes from others packages.
    // It implies the idea of 'Encapsulation'.

    public static void doSomething(){
        MyUtils.printStrings("Hello");
    }
}

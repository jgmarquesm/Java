package java_basics;

class PrivateExample {

    // This class can be acessed by the others classes from the same package, but not
    // to classes from others packages.

    public static void doSomething(){
        MyUtils.printStrings("Hello");
    }
}

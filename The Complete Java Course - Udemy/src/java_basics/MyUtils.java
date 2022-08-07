package java_basics;

public class MyUtils {

    public static void main(String[] args) {

        System.out.println(examplePrivate("HEY"));
    }
    // In this class we can define any method we want to, and we can use it in another class
    // by using the prefix MyUtils.METHODNAME

    /*
     Void methods doesn't return anything, it just does some task, like print, etc...
     The public keyword is an acess modifier, and it means that everyone can use the class,
     the method, etc...
     When we want to restrict our method to use locally(only in the scope), instead use public modifier we must use
     the private modifier that do the opposite thing of public. To restrict our class we can
     just delete the public modifier before its declaration.
     It's important to note that even the class is now private, we can acess and use it here.
    */
    public static void printStrings(String str){

        System.out.println(str);
    }

    public static void printNumbers(double num){

        if (num == (long) num){
            System.out.println((long) num);
        } else {
            System.out.println(num);
        }
    }

    // To return some information, we need to specify the type of returning.
    public static double floatingSoma(double a, double b){
        return a + b;
    }

    public static int integerSoma(int a, int b){
        return a + b;
    }

    private static String examplePrivate(String str){
        return "we can't use this " + str + " out of this scope.";
    }

    // To understand the use of static keyword we must know what instance is, and it is a
    // object create from a class.
    /*
    The static keyword says that the method just can be acessed by static ways. But what is means?
    It means that we cannot acess it using a variable (instance, object in this case.) because it
    is static, so if we want to create some methods that do something with the instances
    we must not use static keyword.
    */

    public String nonStaticExemple(String str){
        return str + "!!!";
    }
}

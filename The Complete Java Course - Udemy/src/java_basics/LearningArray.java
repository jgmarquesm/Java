package java_basics;

public class LearningArray {

    public static void main(String[] args) {

        // Array are a Data Structure that store many values, but only of the same type.
        // How to declare it:
        /*
        TYPE [] arrayName = new TYPE[n];
        or
        TYPE [] arrayName = new TYPE[] {values, separated, by, comma}; */
        // Look at the above declaration... There we can see a 'n'. But it means?
        // It means how many values the arrayName can store, or how many slot it has;
        // Its impostant to say that the slot count begins in 0 and finishes in n-1;

        int [] intArray = new int[100];

        // The way to assign values in each slot is:
        intArray[0] = 10;
        // ...
        intArray[99] = 1000;

        // Let's see one thing here...
        System.out.println(intArray[0]);
        System.out.println(intArray[49]);
        System.out.println(intArray[99]);

        // Did you notice it?
        // The value of any slot that still not assigned is 0 for default.
        // We can declare the array by other way - like literal way:

        String [] stringArray = new String[] {"Hello", ",", "my", "name", "is", "João", "."};
        // And it is equal to:
        String [] stringArray2 = new String[7];

        stringArray2[0] = "Hello";
        stringArray2[1] = ",";
        stringArray2[2] = "my";
        stringArray2[3] = "name";
        stringArray2[4] = "is";
        stringArray2[5] = "João";
        stringArray2[6] = ".";

        System.out.println(stringArray[6]);
        System.out.println(stringArray2[5+1]);

        // If you declare a new array using a name that has already been used, it will be
        // overwritten;
        intArray = new int[] {0, 1, 2, 3, 4, 5};
        System.out.println("Array overwritten...");
        System.out.println(intArray[0]);
    }
}

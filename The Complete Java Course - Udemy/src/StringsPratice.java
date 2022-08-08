public class StringsPratice {

    public static void main(String[] args) {

        String str = "Hello";
        String quote = "Ipsum lorem...";

        // String Length
        System.out.println(str.length());

        // Accessing index of a String by chars or substring
        // If it has more than one same char or substring, the return is the first occurence.
        System.out.println(str.indexOf("el"));
        System.out.println(str.indexOf("o"));
        // Looking the above example its easy to note that the in same way as arrays, strings
        // index starts in 0 and finishes in str.length()-1;

        // To find the last index of the occurrence of a char or string, use:
        System.out.println(str.lastIndexOf("l"));

        // If we try to access an index that does not exist, it will return -1;
        System.out.println(str.indexOf("y"));

        // We also can do the opposite. If we wanna know what is the char at an index, let's use
        System.out.println(quote.charAt(10));
        // And if we try to access a char at an index that does not exist, it throws an Exception

        // Look how funny is use this 2 methods together (and obviously complete unnecessary):
        System.out.println(quote.charAt(quote.indexOf("u")));
        System.out.println(quote.indexOf(quote.charAt(1)));

        // Substrings
        // From the passed index to the rest of str
        String extractedStr = str.substring(2);
        System.out.println(extractedStr);
        // From the first passed index to the second index passed (exclusive -> not include
        // the second index)
        String extractedStr2 = str.substring(1, 4);
        System.out.println(extractedStr2);

        // How to compare String
        // Don't use '==' instead equals. ALWAYS use equals;
        if (str == "Hello"){
            System.out.println("== works, but not all the times.");
        }
        if (str.equals("Hello")){
            System.out.println("equals works better.");
        }
        // To compare ignoring the upper and lower case use equalsIgnoreCase()
        if (str.equalsIgnoreCase("hELLO")){
            System.out.println("Case was ignored.");
        }


    }
}

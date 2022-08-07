package examplepackage;

// Commenting the code just to stop error signal

//import java_basics.PrivateExample;
import java_basics.MyUtils;

public class TryToUsePrivateClass {

    // When we delete the public modifier on PrivateExample, it implies 2 erros:
    // importation and use are denied.
    public static void main(String[] args) {

        //PrivateExample.doSomething();
    }

    public static void doSomething(){

        MyUtils.printStrings("If it is working is because the trying to use the PrivateExample" +
                " is commet.");
    }
}

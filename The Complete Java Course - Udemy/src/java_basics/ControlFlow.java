package java_basics;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {

        /* An if statement is a control flow that need to satisfy a condition to execute
        some code, and if the condition is not satisfy it will not execute the code block
        but if there is an else statement it will execute.
        An else if is a statement that execute that one conditions is not stisfies but
        another is. if, else if and else eg:

        if (condition1){

        } else if (condition2){

        } else if (condition3){

        }
        ...
        } else if (conditionN){

        } else {

        } */
        Scanner inVariable = new Scanner(System.in);
        boolean hungry;
        String hungryString;
        String food;

        System.out.println("(true or false)Are you hungry?");
        hungry = inVariable.nextBoolean();
        System.out.println("Have food at home?");
        food = inVariable.next();

        if (hungry){
            if (food.equalsIgnoreCase("yes")){
                System.out.println("Just eat!");
            } else if (food.equalsIgnoreCase("no")){
                System.out.println("Go to market and buy food.");
            } else {
                System.out.println("Sorry, I didn't understand.");
            }
        } else {
            System.out.println("Okay.");
        }

        // Other way to control flow based in some conditions is using a switch case.
        // There are some ways to write thw switch statement
        /*
        switch (){
        case condition1:
            some Java code...
            break;
        case condition2:
            some Java code...
            break;
        case condition3:
            some Java code...
            break;
        ...
        case conditionN:
            some Java code...
            break;
        default:
            some Java code...
        }
        or
        switch (condition) {
            case condition1 -> some Java code...;
            case condition2 -> some Java code...;
            case condition3 -> some Java code...;
            ...
            case conditionN -> some Java code...;
            default -> some Java code...;
        }
        */

        if (hungry){
            hungryString = "yes";
        } else {
            hungryString = "no";
        }

        switch (hungryString){
            case "yes" -> {
                switch (food){
                    case "yes" -> System.out.println("Just eat!");
                    case "no" -> System.out.println("Go to market and buy food.");
                    default -> System.out.println("Sorry, I didn't understand.");
                }
            }
            case "no" -> System.out.println("Okay.");
            default -> System.out.println("Sorry.");
        }
    }
}

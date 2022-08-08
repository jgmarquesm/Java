package loops;

import java.util.Scanner;

public class LoopsPratice {

    public static void main(String[] args) {

        // If we wanna repeat some task a number of times, it is not effective do 1 per 1,
        // so we can use some kinds of Control Structures to do that

        // Let's start with While Loop
        // 1st way - With fixed number of repetitions
        // 2nd way - Until some condition be satisfied.

        // 1st way
        int count = 1;
        while (count <= 10){
            System.out.printf("João#%d.%n", count);
            count++;
        }

        System.out.println("----");

        // 2nd way
        Scanner entry = new Scanner(System.in);
        String str = "";

        while (!str.equalsIgnoreCase("quit")){
            System.out.println("You say... ");
            str = entry.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                break;
            } else if (str.equals("")){
                continue;
            } else if (!str.equalsIgnoreCase("quit")) {
                System.out.printf("%s isn't the right word! Try again.%n", str.toUpperCase());
            } else {
                System.out.println("Congratulations! \nYou got it!");
            }
        }

        System.out.println("----");

        // break keyword literally break the flow of the code and finish the execution of loops.
        // When we use continue keyword it means that if during the execution the compiler
        // finds this keyword it will jump that iteration;

        // For Loops - It works the same way that 1st way of while loop;
        for(int i = 1; i <= 10; i++){
            System.out.printf("JoãoGabriel#%d.%n", i);
        }

        System.out.println("-----");

        // For loops - Nested
        // Its also possible do nested for loops, for example passing by the index of a Matrix
        /*
        for(conditions1){
            for(conditions2){
                for(conditions3){
                    ...
                    for(conditionsN){
                        Java code;
                    }
                }
            }
        }
        */
        // Example:
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.printf("Matrix element (%d, %d).%n", i, j);
            }
        }
    }
}

package processingfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws MyUtils.MyExceptionName {

        String thisDirectory = "/home/notebook/Área de Trabalho/Github/Projetos/Java/The Complete Java Course - Udemy/src/processingfiles/";

        // The Scanner con be used for take an input from the user
        Scanner input = new Scanner(System.in);

        // nextLine Method read the inout until it finds a line break
        System.out.println("Enter anything...");
        String inputStr = input.nextLine();
        System.out.println(inputStr);

        // next Method read until if find a whitspace
        System.out.println("Enter anything again...");
        String inputStr2 = input.next();
        System.out.println(inputStr2);
        input.close();

        /*
        In addition to strings, we can take much data types using Scanner. Some examples:

         input.nextBoolean();
         input.nextBigDecimal();
         input.nextBigInteger();
         input.nextByte();
         input.nextDouble();
         input.nextFloat();
         input.nextInt();
         input.nextLong();
         input.nextShort();
        */

        // Using Scanner, we also can take input from files
        try {
            String path = thisDirectory + "example.txt";
            File file = new File(path);
            Scanner inputFile = new Scanner(file);

            while(inputFile.hasNextLine()) {

                String line = inputFile.nextLine();
                System.out.println(line);
            }
            inputFile.close();
        } catch(FileNotFoundException e) {

            System.out.println("File not found.");
        }
        /*
        Above we could see a super intereting example... Java impose that you do something
        with exceptions... You can use a try-catch or throws it... And above I choose to use try-catch
        But, let's see how throws new exceptions.
        */
        MyUtils util1 = new MyUtils();
        System.out.println(util1.subtract10FromNum(9));
    }
}

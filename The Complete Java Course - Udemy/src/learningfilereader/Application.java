package learningfilereader;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        String thisDirectory = "/home/notebook/Área de Trabalho/Github/Projetos/Java/The Complete Java Course - Udemy/src/learningfilereader/";

        String path = thisDirectory + "myfile.txt";
        File file = new File(path);

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.printf("Could not read file: %s.%n", file.getName());
            throw new RuntimeException(e);
        }
    }
}

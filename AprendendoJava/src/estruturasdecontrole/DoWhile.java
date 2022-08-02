package estruturasdecontrole;

public class DoWhile {
    public static void main(String[] args) {
        // Temos alguns tipos de laços de repetição. Um deles é o do while, que é muito semelhante ao while;
        // As diferenças são basicamente duas:
        //    - a forma com que é declarado;
        //    - ele se repete pelo menos uma vez, mesmo que a condição seja false;

        // Do While:
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i<10);
    }
}

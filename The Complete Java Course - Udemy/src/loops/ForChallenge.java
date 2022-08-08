package loops;

public class ForChallenge {

    public static void main(String[] args) {

        String name = "João Gabriel Mendes";
        for (int i = name.length()-1; i >= 0; i--){
            System.out.printf("char: %s%n", name.charAt(i));
        }
    }
}

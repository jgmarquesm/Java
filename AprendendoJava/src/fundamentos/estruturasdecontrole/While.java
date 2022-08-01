package fundamentos.estruturasdecontrole;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        Temos alguns tipos de laços de repetição. Um deles é o While, o qual pode ser usado (não usual e nem recomandado)
        com uma condição determinada, e de forma indeterminada.
        */

        // While determinado:
        // Nesse caso é usada uma variável chamada de contador, temo uma condição dentro do laço de repetição e temos
        // uma nova atribuição à variável conrtador;
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }
        // While indeterminado:
        // Nesse caso, o laço fica rodando até que um condição seja satisfeita, e essa condição pode ser satistfeita com
        // 1 run do laço ou com infinitos runs, de modo que só para quando a condiçãio requerida for satisfeita.
        // No código abaixo, enquanto o usuário não digitar sair, o programa continuará perguntando uma palavra. Veja:

        Scanner entrada = new Scanner(System.in);
        String str = "";

        while (!str.equalsIgnoreCase("sair")){
            System.out.println("Você diz... ");
            str = entrada.nextLine();
            if (!str.equalsIgnoreCase("sair")) {
                System.out.printf("%s não é a palavra correta! Tente novamente.%n", str.toUpperCase());
            } else {
                System.out.printf("Parabéns! Você conseguiu %s.", str.toUpperCase());
            }
        }
    }
}

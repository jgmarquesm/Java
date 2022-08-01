package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        /* Usando o console, podemos imprimir resultados, solicitar dados dos usuários, entre outras coisas.
        - A forma que imprimimos a saída no console é usando o System.out.print() ou System.out.println() ou ainda o
        System.out.printf().
        - Para receber dados do usuário pela console podemos usar o Scanner -> Scanner entrada = new Scanner(System.in);
            O Scanner pode receber diversos tipos de dados, veja mais:*/

        Scanner entrada = new Scanner(System.in);

        // Pegando um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numInt = entrada.nextInt();

        // Pegando um número de ponto flutuante
        System.out.print("Digite um número float: ");
        float numFloat = entrada.nextFloat();

        // Pegando uma String
        System.out.print("Digite uma string: ");
        String str = entrada.next();

        System.out.printf(Locale.US,"inteiro: %d, float: %2.1f, string: %s.%n", numInt, numFloat, str);

        // Sempre que o dado for recebido pelo método nextLine() e ele estiver como último dado a ser recebido
        // ele "finaliza" o recebimento sem executar;

        // Fechando o Scanner para poupar recusrsos da máquina.
        entrada.close();
    }
}

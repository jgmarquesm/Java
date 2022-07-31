package fundamentos;

import java.util.Locale;

public class Prints {

    public static void main(String[] args) {
        // println -> imprime e o cursor pula para a linha de baixo;
        System.out.println("Oi, eu sou seu segundo programa em Java!");

        // print -> imprime e o cursor permanece na mesma linha;
        System.out.print("Consegue perceber a diferença?");

        // pular linha;
        System.out.println("\n");

        // printf -> imprime formatando a saída;
        String nome = "João";
        System.out.printf("Olá, %s!", nome);

        System.out.println("\nUm pouco mais sobre o printf:");

        /*
        Abaixo segue uma Cheat Sheet para formatação de impressões em Java;

        Specifier	Explanation
        %c	        Format characters
        %d	        Format decimal (integer) numbers (base 10)
        %e	        Format exponential floating-point numbers
        %f	        Format floating-point numbers
        %i	        Format integers (base 10)
        %o	        Format octal numbers (base 8)
        %s	        Format string of characters
        %u	        Format unsigned decimal (integer) numbers
        %x	        Format numbers in hexadecimal (base 16)
        %n	        add a new line character
        */

        System.out.println("Formatando strings:");
        /*
        Para formatar string podemos usar o specifier: %s;
            - se usarmos o specifier %S imprimimos a string em uppercase;
        Podemos ainda adicionar Padding na formatação:
            - para adicionar padding à esquerda use: %xs;
            - para adicionar padding à direita use: %-xs;
                - Onde x é a quantidade de caracteres para o padding;
                - O padding só é feito se string.length() < x, caso contrário não será adicionado padding;
         Podemos imprimir ainda apenas parte da string usando: %.ys;
            - Onde y é a quantidade de caracteres que serão impressos;
         Ainda é possível combinar padding e a impressão de apenas alguns caracteres da string, usando: %x.ys;
        */
        String str = "hello world";
        System.out.printf("%s%n", str);
        System.out.printf("%S%n", str);
        System.out.printf("'%20s'%n", str);
        System.out.printf("'%-20s'%n", str);
        System.out.printf("%.2s%n", str);
        System.out.printf("'%5.3s'%n", str);

        System.out.println("Formatando inteiros:");
        /*
        Para formatar a impressão de um byte, short, int, long, and BigInteger usamos o specifier:  %d;
        Para dividir milhares colocamos uma vírgula entre a porcentagem e o specifier: %,d;
            - Podemos ainda usar o parametro Locale.NOMEDOLOCAL *Pesquisar pela Classe Locale. Ex.:
                System.out.printf(Locale.ITALY, "Número: %,d", 10000);
        */
        System.out.printf(Locale.ITALY, "Número: %,d%n", 10000);
        System.out.printf(Locale.US, "Número: %,d%n", 10000);
        System.out.println("Formatando Floats e Doubles:");
        /*
        Para formatar um float ou Doubles usamos o specifier: %f;
        Para dividir milhares e decimais colocamos uma vírgula entre a porcentagem e o specifier: %,f;
            - Podemos também usar o Locale.NOMEDOLOCAL no %f também;
        Para formatar a quantidade de casas decimais desejadas, podemos usar: '%x.yf';
            - x: é o tamnaho mínimo do número float ou double;
            - y: é a quantidade de casa decimais a serem impressas;
        */
        System.out.printf(Locale.ITALY, "Número: %,f%n", 10000.32);
        System.out.printf(Locale.US, "Número: %,f%n", 10000.32);
        System.out.printf(Locale.ITALY, "Número: %,6.2f%n", 1234.56);
        System.out.printf(Locale.US, "Número: %,6.2f%n", 1234.56);

        System.out.println("Convertendo a impressão de Floats para notação científica:");

        /*Para fazer a conversão de float ou double para notação científica podemos usar o specifier: %x.ye:
        - x: é o tamnaho mínimo do número float ou double;
        - y: é a quantidade de casa decimais a serem impressas;
         */
        System.out.printf(Locale.ITALY, "Número: %3.2e%n", 10000.32);
        System.out.printf(Locale.US, "Número: %3.2e%n", 10000.32);
    }
}
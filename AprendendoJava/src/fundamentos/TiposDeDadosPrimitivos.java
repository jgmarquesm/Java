package fundamentos;

import java.util.Locale;

public class TiposDeDadosPrimitivos {

    public static void main(String[] args) {
        /* Java é um linguagens fortemente tipada, por isso é extremamente importante definir o tipo da variável;
            - Tipos de variáveis:
                - byte
                - short
                - char
                - float
                - double
                - int
                - long
                - boolean

            Para definir uma constante devemos usar a palavra reservada 'final' antes da declaração:
                - Exemplo: definindo pi como uma constante:
                    final double PI = 3.141592;
                - É convenção definir constantes usando letras maiúsculas;
        */

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;

        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        final byte menorByte = Byte.MIN_VALUE;
        final byte maiorByte = Byte.MAX_VALUE;
        final short menorShort = Short.MIN_VALUE;
        final short maiorShort = Short.MAX_VALUE;
        final int menorInt = Integer.MIN_VALUE;
        final int maiorInt = Integer.MAX_VALUE;
        final long menorLong = Long.MIN_VALUE;
        final long maiorLong = Long.MAX_VALUE;
        final float menorFloat = Float.MIN_VALUE;
        final float maiorFloat = Float.MAX_VALUE;
        final double menorDouble = Double.MIN_VALUE;
        final double maiorDouble = Double.MAX_VALUE;

        System.out.println("Imprimindo constantes:");

        System.out.printf(Locale.ITALY, "Menor Byte: %,d%n", menorByte);
        System.out.printf(Locale.ITALY, "Maior Byte: %,d%n", maiorByte);
        System.out.printf(Locale.ITALY, "Menor Short: %,d%n", menorShort);
        System.out.printf(Locale.ITALY, "Maior Short: %,d%n", maiorShort);
        System.out.printf(Locale.ITALY, "Menor Integer: %,d%n", menorInt);
        System.out.printf(Locale.ITALY, "Maior Integer: %,d%n", maiorInt);
        System.out.printf(Locale.ITALY, "Menor Long: %,d%n", menorLong);
        System.out.printf(Locale.ITALY, "Maior Long: %,d%n", maiorLong);
        System.out.printf(Locale.ITALY, "Menor Float: %3.2e%n", menorFloat);
        System.out.printf(Locale.ITALY, "Maior Float: %3.2e%n", maiorFloat);
        System.out.printf(Locale.ITALY, "Menor Double: %3.2e%n", menorDouble);
        System.out.printf(Locale.ITALY, "Maior Double: %3.2e%n", maiorDouble);

        /* inferência de tipos: Podemos definir uma variável ou constante usando 'var' ao invés do tipo explicito do
        dado, o Java infere qual o tipo na declaração;
        */
        var nome = "J";
        var numero = 5;
        System.out.println(nome.getClass());
        System.out.println(numero);

        System.out.println("Operações com números inteiros e float");
        // Soma dos tipos decimais e floating resultam em float:
        // Soma dos tipos decimais resultam em decimal:
        // Soma dos tipos floating resultam em float:
        System.out.printf("10.0+5: %2.1f%n", 10.0+5);
        System.out.printf("10+5: %d%n", 10+5);
        System.out.printf("10.0+5.0: %2.1f%n", 10.0+5.0);
        // Subtração dos tipos decimais e floating resultam em float:
        // Subtração dos tipos decimais resultam em decimal:
        // Subtração dos tipos floating resultam em float:
        System.out.printf("10.0-5: %2.1f%n", 10.0-5);
        System.out.printf("10-5: %d%n", 10-5);
        System.out.printf("10.0-5.0: %2.1f%n", 10.0-5.0);
        // Multiplicação dos tipos decimais e floating resultam em float:
        // Multiplicação dos tipos decimais resultam em decimal:
        // Multiplicação dos tipos floating resultam em float:
        System.out.printf("10.0*5: %2.1f%n", 10.0*5);
        System.out.printf("10*5: %d%n", 10*5);
        System.out.printf("10.0*5.0: %2.1f%n", 10.0*5.0);
        // Divisão dos tipos decimais e floating resultam em float:
        // Divisão dos tipos decimais resultam em decimal:
        // Divisão dos tipos floating resultam em float:
        System.out.printf("10.0/5: %2.1f%n", 10.0/5);
        System.out.printf("10/5: %d%n", 10/5);
        System.out.printf("10.0/5.0: %2.1f%n", 10.0/5.0);
    }
}
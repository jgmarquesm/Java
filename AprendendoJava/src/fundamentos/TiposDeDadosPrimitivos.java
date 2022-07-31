package fundamentos;

import java.util.Locale;

public class TiposDeDadosPrimitivos {

    public static void main(String[] args) {
        /* Java é um linguagens fortemente tipada, por isso é extremamente importante definir o tipo da variável;
            - Tipos de variáveis:
                - byte -> 1 byte
                - short -> 2 bytes
                - int -> 4 bytes
                - long -> 8 bytes : Devemos colocar um 'L' ou 'l' no final do número declarado;
                - float -> 4 bytes : Devemos colocar um 'F' ou 'f' no final do número declarado;
                - double -> 8 bytes
                - char -> delimitado por aspas simples '' e tem apenas um caracter;
                - boolean -> sempre true ou false;

            Para definir uma constante devemos usar a palavra reservada 'final' antes da declaração:
                - Exemplo: definindo pi como uma constante:
                    final float PI = 3.141592f;
                - É convenção definir constantes usando letras maiúsculas;
        */

        // Criando variável de maneira literal:

        byte tipoByte = 127;
        short tipoShort = 32767;
        int tipoInt = 2147483647;
        long tipoLong = 9_223_372_036_854_775_807L; // é possível usar underline para separar números
        float tipoFloat = 2.6F;
        double tipoDouble = 3.59;
        char tipoChar = 'C';
        boolean tipoBooleano = true;

        System.out.println("byte = " + tipoByte);
        System.out.println("short = " + tipoShort);
        System.out.println("char = " + tipoChar);
        System.out.println("float = " + tipoFloat);
        System.out.println("double = " + tipoDouble);
        System.out.println("int = " + tipoInt);
        System.out.println("long = " + tipoLong);
        System.out.println("boolean = " + tipoBooleano);


        System.out.println("Imprimindo constantes:");

        final byte MENORVALOR = Byte.MIN_VALUE;
        final byte MAIORVALOR = Byte.MAX_VALUE;
        final short MENORSHORT = Short.MIN_VALUE;
        final short MAIORSHORT = Short.MAX_VALUE;
        final int MENORINT = Integer.MIN_VALUE;
        final int MAIORINT = Integer.MAX_VALUE;
        final long MENORLONG = Long.MIN_VALUE;
        final long MAIORLONG = Long.MAX_VALUE;
        final float MENORFLOAT = Float.MIN_VALUE;
        final float MAIORFLOAT = Float.MAX_VALUE;
        final double MENORDOUBLE = Double.MIN_VALUE;
        final double MAIORDOUBLE = Double.MAX_VALUE;
        final boolean VERDADEIRO = true;
        final char CARACTER = 'c';

        System.out.printf(Locale.ITALY, "Menor byte: %,d%n", MENORVALOR);
        System.out.printf(Locale.ITALY, "Maior byte: %,d%n", MAIORVALOR);
        System.out.printf(Locale.ITALY, "Menor short: %,d%n", MENORSHORT);
        System.out.printf(Locale.ITALY, "Maior short: %,d%n", MAIORSHORT);
        System.out.printf(Locale.ITALY, "Menor int: %,d%n", MENORINT);
        System.out.printf(Locale.ITALY, "Maior int: %,d%n", MAIORINT);
        System.out.printf(Locale.ITALY, "Menor long: %,d%n", MENORLONG);
        System.out.printf(Locale.ITALY, "Maior long: %,d%n", MAIORLONG);
        System.out.printf(Locale.ITALY, "Menor float: %3.2e%n", MENORFLOAT);
        System.out.printf(Locale.ITALY, "Maior float: %3.2e%n", MAIORFLOAT);
        System.out.printf(Locale.ITALY, "Menor double: %3.2e%n", MENORDOUBLE);
        System.out.printf(Locale.ITALY, "Maior double: %3.2e%n", MAIORDOUBLE);
        System.out.printf("Tipo char: %s%n", CARACTER);
        System.out.printf("Tipo boolean: %b%n", VERDADEIRO);

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
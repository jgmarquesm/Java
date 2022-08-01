package fundamentos.operadores;

public class Aritmeticos {

    public static void main(String[] args) {
        /*
        Existem 3 tipos de operadores: Unários, Binários e Ternários;
            - Unário: Apenas 1 operando; Ex.: a++ -> operandos: a;
            - Binário: 2 operandos; Ex.: a + b -> operandos: a, b;
            - Ternário: 3 operandos; Ex.: d = a ? b : c -> operandos: a, b, c;
        */

        // Operadores Aritméticos (binário):
        System.out.println("Operadores Aritméticos (binário)");
        // Aqui temos as operações básicas da matemática: soma, subtração, multiplicação, divisão, módulo (resto da divisão);

        // Números com ponto flutuante:
        var x = 3.14;
        double y = 2.71;

        System.out.printf("Soma: %f%n", x+y);
        System.out.printf("Subtração: %f%n", x-y);
        System.out.printf("Multiplicação: %f%n", x*y);
        System.out.printf("Divisão: %f%n", x/y);
        System.out.printf("Resto da divisão (módulo): %f%n", x%y);

        // Números decimais:
        int a = 15;
        int b = 4;

        System.out.printf("Soma: %d%n", a+b);
        System.out.printf("Subtração: %d%n", a-b);
        System.out.printf("Multiplicação: %d%n", a*b);
        System.out.printf("Divisão: %d%n", a/b);
        System.out.printf("Divisão usando CAST: %f%n", a/(float) b);
        System.out.printf("Resto da divisão (módulo): %d%n", a%b);
        System.out.printf("Resto da divisão (módulo) usando CAST: %f%n", a%(float) b);
    }
}

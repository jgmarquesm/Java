package fundamentos.operadores;

public class Relacionais {

    public static void main(String[] args) {
        /*
        Existem 3 tipos de operadores: Unários, Binários e Ternários;
            - Unário: Apenas 1 operando; Ex.: a++ -> operandos: a;
            - Binário: 2 operandos; Ex.: a + b -> operandos: a, b;
            - Ternário: 3 operandos; Ex.: d = a ? b : c -> operandos: a, b, c;
        */

        // Operadores Relacionais
        System.out.println("Operadores relacionais (binários)");

        /* Os operadores Relacionais fazer um comparação entre os operandos e retorna um valor boolean se a comparação
         for verdadeira. Os operadores Relacionais são:
            - == (igual) -> Exemplo: 10 == 9 retorna false;
            - != (diferente) -> Exemplo: 10 != 9 retorna true;
            - > (maior) -> Exemplo: 10 > 9 retorna true;
            - >= (maior ou igual) -> Exemplo: 9 >= 9 retorna true;
            - < (menor) -> Exemplo: 10 < 9 retorna false;
            - <= (menor ou igual) -> Exemplo: 9 <= 9 retorna true;
        */
        System.out.printf("10 == 9: %s%n", 10 == 9);
        System.out.printf("10 != 9: %s%n", 10 != 9);
        System.out.printf("10 > 9: %s%n", 10 > 9);
        System.out.printf("10 >= 9: %s%n", 9 >= 9);
        System.out.printf("10 < 9: %s%n", 10 < 9);
        System.out.printf("10 <= 9: %s%n", 9 <= 9);
    }
}

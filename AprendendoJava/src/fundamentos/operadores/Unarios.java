package fundamentos.operadores;

public class Unarios {

    public static void main(String[] args) {
        /*
        Existem 3 tipos de operadores: Unários, Binários e Ternários;
            - Unário: Apenas 1 operando; Ex.: a++ -> operandos: a;
            - Binário: 2 operandos; Ex.: a + b -> operandos: a, b;
            - Ternário: 3 operandos; Ex.: d = a ? b : c -> operandos: a, b, c;
        */

        // Operadores Unários
        System.out.println("Operadores Unários");

        /* Existem operados unários de incremento e decremento, pré-fixados e pós-fixados;
            - Pós-fixados (mais comuns):
                - Incremento: a++ -> a += 1 -> a = a + 1;
                - Decremento: a-- -> a -= 1 -> a = a - 1;
            - Pré-fixados:
                - Incremento: ++a -> a += 1 -> a = a + 1;
                - Decremento: --a -> a -= 1 -> a = a - 1;
        */

        int a = 1;
        float b = 3.2F;
        int c = 2;

        a++;
        b--;

        System.out.printf("a= %d%n", a);
        System.out.printf("b= %2.1f%n", b);
        a--;

        // Devemos notar que ++a == c--, mas a++ != --c Veja:
        System.out.printf("++a == c--: %s%n", ++a == c--);
        System.out.printf("a++ == --c: %s%n", a++ == --c);
        // Isso acontece por conta da prescedencia de operações; Quando se colocar o operador antes da variável, dizemos
        // ao Java que estamos com pressa de fazer aquela operação, de modo que ele dá prioridade à ela em relação ao
        // operador após a variável.
    }
}

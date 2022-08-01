package fundamentos.operadores;

public class Atribuicao {

    public static void main(String[] args) {
        /*
        Existem 3 tipos de operadores: Unários, Binários e Ternários;
            - Unário: Apenas 1 operando; Ex.: a++ -> operandos: a;
            - Binário: 2 operandos; Ex.: a + b -> operandos: a, b;
            - Ternário: 3 operandos; Ex.: d = a ? b : c -> operandos: a, b, c;
        */

        // Operadores Relacionais
        System.out.println("Operadores de atribuição (binários)");

        /*
        Temos alguns operadores de atribuição que são:
            - = -> atibui uma valor específico à variável. Exemplo: int a = 9;
            - += -> soma um valor na própria variável. Exemplo: a += 1 -> a = a + 1;
            - -= -> subtrai um valor na própria variável. Exemplo: a -= 1 -> a = a - 1;
            - *= -> multiplica a própria variável por um fator. Exemplo: a *= 2 -> a = a * 2;
            - /=-> divide a própria variável por um valor. Exemplo: a /= 2 -> a = a / 2;
        */

        int a = 10;
        float b = 9.9F;
        var c = a + b;
        var d = a + b;
        var e = a + b;
        var f = a + b;
        System.out.printf("c = a += b: %f%n", c);
        d -= 2;
        System.out.printf("d -= 2: %f%n", d);
        e *= 3;
        System.out.printf("e *= 3: %f%n", e);
        f /= 2;
        System.out.printf("f /= 2: %f%n", f);
    }
}

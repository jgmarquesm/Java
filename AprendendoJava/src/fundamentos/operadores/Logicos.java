package fundamentos.operadores;

public class Logicos {

    public static void main(String[] args) {
        /*
        Existem 3 tipos de operadores: Unários, Binários e Ternários;
            - Unário: Apenas 1 operando; Ex.: a++ -> operandos: a;
            - Binário: 2 operandos; Ex.: a + b -> operandos: a, b;
            - Ternário: 3 operandos; Ex.: d = a ? b : c -> operandos: a, b, c;
        */

        // Operadores Lógicos
        System.out.println("Operadores Lógicos (binários, unário - !)");
        boolean t = true;
        boolean f = false;
        // Temos os 3 principais: && (and), || (or), ! (not);
        //    - Podemos ainda usar o operador excluse or: ^ (xor)

        /*
        Tabela Verdade && (and):
        ===============================================================
        |   Condição 1   |   Operador   |   Condição 2   |  Retorno   |
        ===============================================================
        |      true      |      &&      |      true      |   true     |
        ---------------------------------------------------------------
        |      true      |      &&      |      false     |   false    |
        ---------------------------------------------------------------
        |      false     |      &&      |      true      |   false    |
        ---------------------------------------------------------------
        |      false     |      &&      |      false     |   false    |
        ===============================================================
        -> Returna 'true' se, e somente se, todas as condições forem verdadeiras;
        */
        System.out.println("\nTabela verdade && (and): -> Returna 'true' se, e somente se, todas as condições forem verdadeiras.\n");
        System.out.printf("true and true: %s%n", t&&t);
        System.out.printf("true and false: %s%n", t&&f);
        System.out.printf("false and true: %s%n", f&&t);
        System.out.printf("false and false: %s%n", f&&f);
        /*
        Tabela Verdade || (or):
        ===============================================================
        |   Condição 1   |   Operador   |   Condição 2   |  Retorno   |
        ===============================================================
        |      true      |      ||      |      true      |   true     |
        ---------------------------------------------------------------
        |      true      |      ||      |      false     |   true     |
        ---------------------------------------------------------------
        |      false     |      ||      |      true      |   true     |
        ---------------------------------------------------------------
        |      false     |      ||      |      false     |   false    |
        ===============================================================
        -> Returna 'false' se, e somente se, todas as condições forem falsas;
        */
        System.out.println("\nTabela verdade || (or): -> Returna 'false' se, e somente se, todas as condições forem falsas.\n");
        System.out.printf("true or true: %s%n", t||t);
        System.out.printf("true or false: %s%n", t||f);
        System.out.printf("false or true: %s%n", f||t);
        System.out.printf("false or false: %s%n", f||f);
        /*
        Tabela Verdade ^ (xor):
        ===============================================================
        |   Condição 1   |   Operador   |   Condição 2   |  Retorno   |
        ===============================================================
        |      true      |       ^      |      true      |   false    |
        ---------------------------------------------------------------
        |      true      |       ^      |      false     |   true     |
        ---------------------------------------------------------------
        |      false     |       ^      |      true      |   true     |
        ---------------------------------------------------------------
        |      false     |       ^      |      false     |   false    |
        ===============================================================
        -> Returna 'true' se, e somente se, apenas uma das condições forem verdadeiras;
        */
        System.out.println("\nTabela verdade ^ (xor): -> Returna 'true' se, e somente se, apenas uma das condições forem verdadeiras.\n");
        System.out.printf("true xor true: %s%n", t^t);
        System.out.printf("true xor false: %s%n", t^f);
        System.out.printf("false xor true: %s%n", f^t);
        System.out.printf("false xor false: %s%n", f^f);
        /*
        Tabela Verdade ! (not):
        =============================================
        |   Operador   |   Condição   |   Retorno   |
        =============================================
        |      !       |     true     |    false    |
        ---------------------------------------------
        |      !       |     false    |    true     |
        =============================================
        -> Inverte o valor da condição;
        */
        System.out.println("\nTabela verdade ! (not): -> Inverte o valor da condição.\n");
        System.out.printf("not true: %s%n", !t);
        System.out.printf("not false: %s%n", !f);
        System.out.printf("not (not true): %s%n", !!t);
        System.out.printf("not (not false): %s%n", !!f);
    }
}

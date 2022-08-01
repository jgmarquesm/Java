package fundamentos.tipodedados;

public class Wrappers {

    public static void main(String[] args) {

        /*
        Wrappers são a versão Objeto dos tipos primitivos, com isso podemos acessar uma lista de métodos associados á
        cada representação de um tipo primitivo;

        Tipo Primitivo  |  Class()
        -------------------------------
            byte        |   Byte()
            short       |   Short()
            int         |   Integer()
            long        |   Long()
            float       |   Float()
            double      |   Double()
            char        |   Character()
            boolean     |   Boolean()

         Com isso temos acessos à vários métodos disponíveis para cada Wrapper que representa um tipo primitivo.
         Muitas vezes precisamos apenas do valor literal da variável, nesses casos usamos os tipos Primitivos.
        */

        Byte byteAsObject = 127;
        Short shortAsObject = 32767;
        Integer intAsObject = 2147483647;
        Long longAsObject = 9_223_372_036_854_775_807L;
        Float floatAsObject = 2.6F;
        Double doubleAsObject = 3.14;
        Character charAsObject = 'c';
        Boolean booleanAsObject = true;

        System.out.printf("Valor: %d. Tipo: %s %n", byteAsObject, byteAsObject.getClass());
        System.out.printf("Valor: %,d. Tipo: %s %n", shortAsObject, shortAsObject.getClass());
        System.out.printf("Valor: %,d. Tipo: %s %n", intAsObject, intAsObject.getClass());
        System.out.printf("Valor: %,d. Tipo: %s %n", longAsObject, longAsObject.getClass());
        System.out.printf("Valor: %3.2f. Tipo: %s. %n", floatAsObject, floatAsObject.getClass());
        System.out.printf("Valor: %3.2f. Tipo: %s. %n", doubleAsObject, doubleAsObject.getClass());
        System.out.printf("Valor: %s. Tipo: %s %n", charAsObject, charAsObject.getClass());
        System.out.printf("Valor: %s. Tipo: %s %n", booleanAsObject, booleanAsObject.getClass());
    }
}

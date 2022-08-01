package fundamentos.tipodedados;

public class ConversaoDeTiposPrimitivosNumericos {

    public static void main(String[] args) {

        // Existem conversões implícitas que são quando o tipo a ser convertido é menor (em bytes) que o tipo para a
        // conversão. Exemplos:
        double intToDouble= 1;
        double floatToDouble = 3.2;
        long intToLong = 1;

        System.out.printf("int to double: %f%nfloat to double: %f%nint to long: %d%n", intToDouble, floatToDouble,
                intToLong);

        // E também existem conversões explícitas (CAST) que são o contrário das implícitas. Exemplos:
        // Nesse caso, o Java obriga o programador a explicitar a conversão como forma de "Saber o que está fazendo".

        float doubleTofloat = (float) 1.7637562361327412634;
        int doubleToint = (int) 1.0;
        byte intToByte = (byte) 512;
        long l = 1000L;

        System.out.printf("Double to Float: %f%n", doubleTofloat);
        System.out.printf("Double to int: %d%n", doubleToint);
        System.out.printf("Int to Byte: %d%n", intToByte);
        System.out.printf("Long: %d%n", l);
    }
}

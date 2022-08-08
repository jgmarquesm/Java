public class ClientProgram {

    public static void main(String[] args) {

        Multiplier mult = new Multiplier();
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        int result = mult.multiply(num1, num2, num3);
        System.out.printf("%d * %d * %d = %d.%n", num1, num2, num3, result);
    }
}

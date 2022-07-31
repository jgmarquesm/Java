package fundamentos;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        double tempEmF = 32;
        double tempEmC = -57.599;
        final int SHIFT = 32;
        final float FATOR = 5/9.0F;
        double celsius = (tempEmF-SHIFT)*FATOR;
        double fahrenheit = tempEmC*FATOR + SHIFT;

        System.out.printf("%3.2f ºF = %3.2f ºC %n" , tempEmF, celsius);
        System.out.printf("%3.2f ºC = %3.2f ºF %n" , tempEmC, fahrenheit);
    }
}

package fundamentos.tipodedados;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        final int SHIFT = 32;
        final float FATOR = 5/9.0F;
        float tempEmF = 32F;
        float tempEmC = -57.599F;
        float celsius = (tempEmF-SHIFT)*FATOR;
        float fahrenheit = tempEmC*FATOR + SHIFT;

        System.out.printf("%3.2f ºF = %3.2f ºC %n" , tempEmF, celsius);
        System.out.printf("%3.2f ºC = %3.2f ºF %n" , tempEmC, fahrenheit);
    }
}

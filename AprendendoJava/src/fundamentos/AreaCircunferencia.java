package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircunferencia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor do raio? ");
        float raio = entrada.nextFloat();
        final double PI = 3.141592;
        double area = PI * raio * raio;

        System.out.printf(Locale.ITALY, "A área do círculo é: %3.2f m^2", area);

        entrada.close();
    }
}

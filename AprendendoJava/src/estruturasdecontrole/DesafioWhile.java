package estruturasdecontrole;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota (ou -1 para sair): ");
        double nota = entrada.nextDouble();

        int qtdNotasValidas = 0;
        double total = 0;

        while (nota != -1.0){
            if (nota > 10 || nota < 0){
                System.out.println("Digite uma nota válida!");
            } else {
                total += nota;
                qtdNotasValidas++;
            }
            System.out.println("Digite uma nota (ou -1 para sair): ");
            nota = entrada.nextDouble();
        }
        if (qtdNotasValidas != 0) {
            System.out.printf("A média é: %.2f.%n", total / qtdNotasValidas);
        }
        System.out.println("Obrigado por usar esse software.");
        entrada.close();
    }
}

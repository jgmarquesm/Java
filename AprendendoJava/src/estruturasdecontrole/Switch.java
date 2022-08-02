package estruturasdecontrole;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // O SwitchCase é uma opção para evitar o uso de vários if e elses sem necessidade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua faixa: ");
        String faixa = entrada.next();

        switch (faixa.toLowerCase(Locale.ROOT)){
            case "preta":
                System.out.println("Sou faixa preta.");
            case "marrom":
                System.out.println("Sou faixa marrom.");
            case "roxa":
                System.out.println("Sou faixa roxa.");
            case "verde":
                System.out.println("Sou faixa verde.");
            case "laranja":
                System.out.println("Sou faixa laranja.");
            case "vermelha":
                System.out.println("Sou faixa vermelha.");
            case "amarela":
                System.out.println("Sou faixa amarela.");
            default:
                System.out.println("Sou faixa branca.");
        }
        System.out.println("-----");

        // NOte que a maneira que fizemos acima, precisa necessariamente de um break a cada
        // caso, pois se não ele executa todos os outros casos abaixo. Na maioria dos casos,
        // isso não é intressante desse modo, podemos tentar novamente usando o break:

        switch (faixa.toLowerCase(Locale.ROOT)){
            case "preta":
                System.out.println("Sou faixa preta.");
                break;
            case "marrom":
                System.out.println("Sou faixa marrom.");
                break;
            case "roxa":
                System.out.println("Sou faixa roxa.");
                break;
            case "verde":
                System.out.println("Sou faixa verde.");
                break;
            case "laranja":
                System.out.println("Sou faixa laranja.");
                break;
            case "vermelha":
                System.out.println("Sou faixa vermelha.");
                break;
            case "amarela":
                System.out.println("Sou faixa amarela.");
                break;
            default:
                System.out.println("Sou faixa branca.");
        }
        System.out.println("-----");

        // Entretanto, em versões mais novas do Java podemos ainda fazer da seguinte maneira:

        switch (faixa.toLowerCase(Locale.ROOT)) {
            case "preta" -> {
                System.out.println("Sou faixa preta.");
            }
            case "marrom" -> {
                System.out.println("Sou faixa marrom.");
            }
            case "roxa" -> {
                System.out.println("Sou faixa roxa.");
            }
            case "verde" -> {
                System.out.println("Sou faixa verde.");
            }
            case "laranja" -> {
                System.out.println("Sou faixa laranja.");
            }
            case "vermelha" -> {
                System.out.println("Sou faixa vermelha.");
            }
            case "amarela" -> {
                System.out.println("Sou faixa amarela.");
            }
            default -> {
                System.out.println("Sou faixa branca.");
            }
        }
        System.out.println("-----");

        // Mas como temos apenas uma linha no bloco de código, ele é redundante
        // desse modo, nesse exemplo, ainda podemos fazer melhor:

        switch (faixa.toLowerCase(Locale.ROOT)) {
            case "preta" -> System.out.println("Sou faixa preta.");
            case "marrom" -> System.out.println("Sou faixa marrom.");
            case "roxa" -> System.out.println("Sou faixa roxa.");
            case "verde" -> System.out.println("Sou faixa verde.");
            case "laranja" -> System.out.println("Sou faixa laranja.");
            case "vermelha" -> System.out.println("Sou faixa vermelha.");
            case "amarela" -> System.out.println("Sou faixa amarela.");
            default -> System.out.println("Sou faixa branca.");
        }

        entrada.close();
        // O switch recebe diversos tipos de parametros, como String inteiros, float entre outros;
    }
}

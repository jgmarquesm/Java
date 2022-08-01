package fundamentos.estruturasdecontrole;

public class For {
    public static void main(String[] args) {
        /*
        Temos alguns tipos de laços de repetição. Um deles é o 'for', ele funciona de maneira semelhante ao loop while.
        Mas diferentemente do loop while, a declaração, verificação de condição e atribuição da variável de controle
        e feita na declaração do loop for:
        */
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // O loop for é muito semelhente ao loop while determinado, tanto que podemos até fazer a chamada do laço assim:
        // Embora essa não seja uma boa prática, a própria IDE sugere mudar para o laço while quando é feito assim.
        int contador = 11;
        for (; contador <= 20; ) {
            System.out.println(contador);
            contador++;
        }

        /*
        laço infinito com for:
        for(;;){
        System.out.println("infinito!");
        }
        */

        // for aninhado: laço for dentro de outro laço for;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.printf("[%d, %d, %d]%n", i, j, k);
                }
            }
        }
    }
}

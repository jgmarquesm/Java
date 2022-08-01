package fundamentos.operadores;

public class DesafioOperadoresLogicos {

    public static void main(String[] args) {

        // Tabalho na terça (true or false)
        // Trabalho na quinta (true or false)
        // Se fizer apenas um trabalho: comprar tv 50" e tomar sorvete;
        // Se fizer dois trabalhos: comprar tv 32" e tomar sorvete;
        // Se não fizer nenhum trabalho: ficar em casa;

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        boolean tv32 = trabalhoTerca^trabalhoQuinta;
        boolean tv50 = trabalhoTerca&&trabalhoQuinta;
        boolean tomouSorvte = tv32||tv50;
        boolean casa = !tomouSorvte;

        System.out.println("Comprou TV 50\"? " + tv50);
        System.out.println("Comprou TV 32\"? " + tv32);
        System.out.println("Tomou sorvete? " + tomouSorvte);
        System.out.println("Ficou em casa? " + casa);
    }
}

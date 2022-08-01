package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {
        /*
        Existem 3 tipos de operadores: Unários, Binários e Ternários;
            - Unário: Apenas 1 operando; Ex.: a++ -> operandos: a;
            - Binário: 2 operandos; Ex.: a + b -> operandos: a, b;
            - Ternário: 3 operandos; Ex.: d = a ? b : c -> operandos: a, b, c;
        */

        // Operador ternários
        System.out.println("Operador Ternário.");

        // O operador ternário é um operador de atribuição condicional.
        //    - d = a ? b : c -> se a for verdadeiro, d = b, caso contrario d = c;

        // Exemplo 1:
        double media = 9;
        String resultadoParcial = media >= 5 ? "de recuperação" : "Reprovado";
        String resultado = media>= 7 ? "Aprovado" : resultadoParcial;
        System.out.println("O aluno está " + resultado + ".");

        // Exemplo 2:
        double nota = 9.0;
        boolean comportado = false;
        boolean passouPorNota = nota >= 7;
        String recupRep = nota>= 5 ? "de recuperação" : "reprovado" ;
        String aprov = passouPorNota ? "aprovado" : recupRep;
        boolean temDescontoMatricula = comportado && passouPorNota;
        String resultadoFinal = temDescontoMatricula ? "Sim." : "Não.";
        System.out.printf("O aluno está %s.%nBaseado no comportamento e nota, ele tem direito a desconto na próxima matícula? %s%n", aprov, resultadoFinal);
    }
}

package estruturasdecontrole;

import java.util.Scanner;

public class IfElseElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 'if', 'elseif1', 'elseif2' ou qualquer outra coisa: ");
        String str = entrada.next();

        /*
        if é um estrutura de controle de fluxo que executa tarefas de um bloco de código ou uma linha se as condições
        requeridas forem satisfeitas;
        Associado ao if, temos o else que executa um bloco de código ou uma linha quando as condições requeridas do if
        não são satisfeitas.
        Associado ainda ao if e ao else, temos o else if que é usado para fazer verificações intermediárias: não se
        satisfazem ao if e não passa direto para o else, primeiro faz uma verificação de condições e se forem satisfeitas,
        executa o bloco de código subsquente ou a próxima linha, Caso não sejam satisfeitas as condições, ele passa para
        o próximo passo que pode ser um outro else if ou diretamente o else;
            - Quando falamos de condições serem satisfeitas queremos dizer que o if e o else if fazem uma comparação
            dos valores passados como condições, se o valor retornado for true, a condição é satisfeita, caso contrário
            não é. Ou seja, o if tem como "argumento" um boolean;
        */

        if(str.equals("if")){
            System.out.println("Entrou no if.");
        } else if (str.equals("elseif1")){
            System.out.println("Entrou no primeiro else if.");
        } else if (str.equals("elseif2")){
            System.out.println("Entrou no segundo else if.");
        } else {
            System.out.println("Não entrou em nenhum.");
        }
        entrada.close();
    }
}

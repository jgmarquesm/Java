package fundamentos;

import javax.swing.*;

public class DesafioFundamentos {

    public static void main(String[] args) {

        // Fazer uma calculador usando apenas o conteúdo aprendido até o momento (sem if, else, etc...)

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ").replace(",", ".");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ").replace(",", ".");
        String operacao = JOptionPane.showInputDialog("Digite uma operação (+, -, *, /, %): ");

        Double num1 = Double.parseDouble(valor1);
        Double num2 = Double.parseDouble(valor2);

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;

        boolean verificaNum2 = num2 != 0;
        double opDivisao = verificaNum2 ? divisao : 0;
        double opModulo = verificaNum2 ? modulo: 0;

        double resultado = operacao.equals("+") ? soma : 0;
        resultado = operacao.equals("-") ? subtracao: resultado;
        resultado = operacao.equals("*") ? multiplicacao: resultado;
        resultado = operacao.equals("/") ? opDivisao: resultado;
        resultado = operacao.equals("%") ? opModulo : resultado;

        String printResultado = String.format("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        System.out.println(printResultado);
    }
}

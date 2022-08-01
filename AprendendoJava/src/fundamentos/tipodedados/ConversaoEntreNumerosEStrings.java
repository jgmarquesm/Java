package fundamentos.tipodedados;

import javax.swing.*;

public class ConversaoEntreNumerosEStrings {

    public static void main(String[] args) {

        // Convertendo números para Strings:

        // Podemos converter um número para String declarando ele usando Wrapper:
        Integer numero1 = 10000;
        System.out.println("Integer to String usando declaração de Wrapper: " + numero1.toString());

        // Mas também podemos usar a função Integer.toString() em um tipo primitivo int:
        //    - Nesse caso, podemos fazer o mesmo pra qualquer Wrapper numérico;
        int numero2 = 1000;
        float numero3 = 3.141592F;
        System.out.println("int to String usando função do Wrapper: ".concat(Integer.toString(numero2)));
        System.out.println("float to String usando função do Wrapper: ".concat(Float.toString(numero3)));

        // Convertendo String para números:
        // Nesse caso, devemos tomar cuidado, pois se a String não for "do tipo numérico";
        //    - Usando aqui o JOptionPane para receber o valor por meio de uma janela Java e não pelo console;
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor:");

        //Para vermos que se trata realmente de Strings, vamos imprimir:
        System.out.println(valor1+valor2);

        // Convertendo para tipos numéricos (tomando o devido cuidado de resguardar que a string pode ser convertida)
        // temos:
        Double num1 = Double.parseDouble(valor1);
        Double num2 = Double.parseDouble(valor2);

        // Verficando que a conversão foi feita:
        double soma = num1+num2;
        System.out.printf("A soma é: %f%n", soma);
        System.out.printf("A média é: %f%n", soma/2);
    }
}

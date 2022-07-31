package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        // String é um objeto imutável, podemos substituir o valor da String, mas não modificar o valor original
        // Não é um tipo primitivo, mas sim um classe, por isso além de fazer a declaração literal, podemos fazer a
        // declaração de uma variável como um objeto:

        // Declaração literal:
        String string1 = "Boa tarde";

        // Declaração como Objeto:
        String string2 = new String("Boa tarde");
        // Declarando como objeto e usando inferencia:
        var string3 = new String("Boa tarde");

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        // Além do printf, para Strings podemos formatar o Objeto ao invés de formatar a impressão, por exemplo:

        var nome = "João";
        String sobrenome = new String("Mendes");
        int idade = 24;

        String frase = String.format("O senhor %s %s tem %d anos.", nome, sobrenome, idade);
        System.out.println(frase);

        System.out.printf("O senhor %s %s tem %d anos", nome, sobrenome, idade);

        // Para uma lista com todos os métodos contidos na Classe String pode acessar:
        // https://www.w3schools.com/java/java_ref_string.asp ou a documentação oficial.
    }
}

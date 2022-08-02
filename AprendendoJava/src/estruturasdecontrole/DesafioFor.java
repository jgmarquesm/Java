package estruturasdecontrole;

public class DesafioFor {
    public static void main(String[] args) {

        // Obter o resultado do laço abaixo sem fazer uso de valores númericos
        String hash = "#";
        for (int i = 1; i <= 5; i++){
            System.out.println(hash);
            hash += "#";
        }

        // Resposta:
        for (String hashtag = "#"; !hashtag.equals("######"); hashtag += "#"){
            System.out.println(hashtag);
        }
    }
}

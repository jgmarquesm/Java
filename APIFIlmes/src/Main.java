import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Para usar a API do IMDB, digite: 1.");
        System.out.println("Para usar a API da Nasa, digite: 2.");

        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();

        String url = "";
        ExtratorDeConteudo extrator = json -> null;
        String frase = "";

        switch (escolha) {
            case 1 -> {
                url = "https://alura-filmes.herokuapp.com/conteudos";
                extrator = new ExtratorDeConteudoDoIMDB();
                frase = "FILME TOP";
            }
            case 2 -> {
                url = "https://api.nasa.gov/planetary/apod?api_key=gsaqohWW65PlcpWa4BxLsSWrva0ONy0plFnHKzsi&start_date=2021-11-02&end_date=2022-01-30";
                extrator = new ExtratorDeConteudoDaNasa();
                frase = "FOTO TOP";
            }
        }

        ImageSearch http = new ImageSearch();
        String json = http.buscaDados(url);

        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        StickersMaker maker = new StickersMaker();

        for (int i = 0; i < 6; i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = "out/figurinhas/" + conteudo.getTitulo() + ".png";

            maker.cria(inputStream, nomeArquivo, frase);

            System.out.println(conteudo.getTitulo());
            System.out.println();
        }
    }
}
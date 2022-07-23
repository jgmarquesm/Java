import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://alura-filmes.herokuapp.com/conteudos";
        URI adress = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(adress).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        StickersMaker maker = new StickersMaker();

        for (Map<String, String> filme : listaDeFilmes){

            String frase = "ESSE É TOP";
            int endIndex = filme.get("image").lastIndexOf("@");
            String urlImagem = filme.get("image").substring(0, endIndex+1) + ".jpg";
            String titulo = filme.get("title");

            InputStream inputStream = new URL(urlImagem).openStream();
            String nomeArquivo = "out/figurinhas/" + titulo + ".png";

            maker.cria(inputStream, nomeArquivo, frase);

            System.out.println(titulo);
            System.out.println(urlImagem);

        }
    }
}
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class ImageSearch {

    public String buscaDados(String url) {

        try {

            URI adress = URI.create(url);
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder(adress).GET().build();
            var response = client.send(request, BodyHandlers.ofString());
            return response.body();

        } catch (IOException | InterruptedException ex){

            throw new RuntimeException(ex);

        }
    }

}

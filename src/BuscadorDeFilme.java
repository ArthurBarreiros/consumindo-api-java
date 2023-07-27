import com.google.gson.Gson;
import models.Filme;
import models.FilmeOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscadorDeFilme {

    public Filme buscaFilme (String titulo) throws IOException, InterruptedException {

        Gson gson = new Gson();

        titulo = titulo.replace(" ", "+");

        URI enderecoRequisao = URI.create("http://www.omdbapi.com/?t=" + titulo + "&apikey=c566319");

        Filme filme = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(enderecoRequisao).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            FilmeOmdb filmeOmdb = gson.fromJson(response.body(), FilmeOmdb.class);
            filme = new Filme(filmeOmdb);

        }
        catch (Exception e) {
            System.out.println("Erro na busca do título!");
        }

        return filme;




    }
}

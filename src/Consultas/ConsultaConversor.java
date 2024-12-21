package Consultas;

import Modelos.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {
    public Moneda buscaMoneda(String codigoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/15ebc6b3b2c181b3d979e4ae/latest/"+codigoDeMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré la moneda solicitada.");
        }
    }
}

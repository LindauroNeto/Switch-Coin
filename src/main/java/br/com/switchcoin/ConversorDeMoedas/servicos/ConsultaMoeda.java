package br.com.switchcoin.ConversorDeMoedas.servicos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import br.com.switchcoin.ConversorDeMoedas.modelos.ReceptorMoedas;

public class ConsultaMoeda {
	
	public ReceptorMoedas criacaoDeConexao(String tipoMoeda) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		final URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + System.getenv("API_KEY_EXCHANGE-RATE") + "/latest/" + tipoMoeda);
		
		HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		return new Gson().fromJson(response.body(), ReceptorMoedas.class);
	}
}

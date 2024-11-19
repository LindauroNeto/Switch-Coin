package br.com.switchcoin.ConversorDeMoedas;

import java.io.IOException;
import java.util.Map;

import br.com.switchcoin.ConversorDeMoedas.modelos.ReceptorMoedas;
import br.com.switchcoin.ConversorDeMoedas.servicos.ConsultaMoeda;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        
        ReceptorMoedas receptorMoedas = consultaMoeda.criacaoDeConexao("USD");
        
        System.out.println(receptorMoedas.toString());
        Map<String, Double> moedasUsa = receptorMoedas.conversion_rates();
        System.out.println(moedasUsa.toString());
    }
}

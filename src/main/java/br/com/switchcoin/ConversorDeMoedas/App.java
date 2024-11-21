package br.com.switchcoin.ConversorDeMoedas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import br.com.switchcoin.ConversorDeMoedas.modelos.ReceptorMoedas;
import br.com.switchcoin.ConversorDeMoedas.servicos.ConsultaMoeda;
import br.com.switchcoin.ConversorDeMoedas.servicos.Conversor;
import br.com.switchcoin.ConversorDeMoedas.servicos.Menus;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        Conversor conversor = new Conversor();
        
        String moedaInicial = "";
        String moedaConversao = "";
        double resultado = 0;
        double valor = 0;
        int opcao = 0;
        
        ReceptorMoedas receptorMoedas;
        Map<String, Double> moedas;
        
        try {
    		while (opcao != 7) {
    			Menus.telaInicial();
            	opcao = scanner.nextInt();
            	
            	switch (opcao) {
              	// De USD para BRL
        		case 1:
        			moedaInicial = "USD";
        			moedaConversao = "BRL";
        			Menus.valorParaSerConvertido(moedaInicial, moedaConversao);
        			valor = scanner.nextDouble();
        			
        			receptorMoedas = consultaMoeda.criacaoDeConexao(moedaInicial);
        			moedas = receptorMoedas.conversion_rates();
        			
        			resultado = conversor.paraBrl(moedas, valor);
        			Menus.exibicaoConversao(valor, moedaInicial, moedaConversao, resultado);
        			break;

        		// De BRL para USD
        		case 2:
        			moedaInicial = "BRL";
        			moedaConversao = "USD";
        			Menus.valorParaSerConvertido(moedaInicial, moedaConversao);
        			valor = scanner.nextDouble();
        			
        			receptorMoedas = consultaMoeda.criacaoDeConexao(moedaInicial);
        			moedas = receptorMoedas.conversion_rates();
        			
        			resultado = conversor.paraUsd(moedas, valor);
        			Menus.exibicaoConversao(valor, moedaInicial, moedaConversao, resultado);
        			break;

        		// De USD para ARS
        		case 3:
        			moedaInicial = "USD";
        			moedaConversao = "ARS";
        			Menus.valorParaSerConvertido(moedaInicial, moedaConversao);
        			valor = scanner.nextDouble();
        			
        			receptorMoedas = consultaMoeda.criacaoDeConexao(moedaInicial);
        			moedas = receptorMoedas.conversion_rates();
        			
        			resultado = conversor.paraArs(moedas, valor);
        			Menus.exibicaoConversao(valor, moedaInicial, moedaConversao, resultado);
        			break;

        		// De ARS para USD
        		case 4:
        			moedaInicial = "ARS";
        			moedaConversao = "USD";
        			Menus.valorParaSerConvertido(moedaInicial, moedaConversao);
        			valor = scanner.nextDouble();
        			
        			receptorMoedas = consultaMoeda.criacaoDeConexao(moedaInicial);
        			moedas = receptorMoedas.conversion_rates();
        			
        			resultado = conversor.paraUsd(moedas, valor);
        			Menus.exibicaoConversao(valor, moedaInicial, moedaConversao, resultado);
        			break;

        		// De USD para CLP
        		case 5:
        			moedaInicial = "USD";
        			moedaConversao = "CLP";
        			Menus.valorParaSerConvertido(moedaInicial, moedaConversao);
        			valor = scanner.nextDouble();
        			
        			receptorMoedas = consultaMoeda.criacaoDeConexao(moedaInicial);
        			moedas = receptorMoedas.conversion_rates();
        			
        			resultado = conversor.paraClp(moedas, valor);
        			Menus.exibicaoConversao(valor, moedaInicial, moedaConversao, resultado);
        			break;

        		// De CLP para USD
        		case 6:
        			moedaInicial = "CLP";
        			moedaConversao = "USD";
        			Menus.valorParaSerConvertido(moedaInicial, moedaConversao);
        			valor = scanner.nextDouble();
        			
        			receptorMoedas = consultaMoeda.criacaoDeConexao(moedaInicial);
        			moedas = receptorMoedas.conversion_rates();
        			
        			resultado = conversor.paraUsd(moedas, valor);
        			Menus.exibicaoConversao(valor, moedaInicial, moedaConversao, resultado);
        			break;

        		case 7:
        			System.out.println("Encerrando o programa");
        			break;

        		default:
        			System.out.println("Opção inválida");
        			break;
        		}
			}
			
		} catch (InputMismatchException ime) {
			System.err.println("Valor invalido...");
		} finally {
			scanner.close();
		}
        
    }
}

package br.com.switchcoin.ConversorDeMoedas.servicos;

public class Menus {
	
	public void telaInicial() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("Seja bem-vindo ao Conversor de Moedas!\nEscolha a opção desejada para fazer a sua conversão\n");
		System.out.println("[1] - DÓLAR => REAL BRASILEIRO");
		System.out.println("[2] - REAL BRASILEIRO => DÓLAR");
		System.out.println("[3] - DÓLAR => PESO ARGENTINO");
		System.out.println("[4] - PESO ARGENTINO => DÓLAR");
		System.out.println("[5] - DÓLAR => PESO CHILENO");
		System.out.println("[6] - PESO CHILENO => DÓLAR");
		System.out.println("\n[7] - SAIR DO PROGRAMA");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
	}
	
	public void exibicaoConversao(String moedaInicial, String moedaConvertida, double valorConvertido) {
		System.out.println(moedaInicial + " para " + moedaConvertida + ", equivale a: " + valorConvertido);
	}
}

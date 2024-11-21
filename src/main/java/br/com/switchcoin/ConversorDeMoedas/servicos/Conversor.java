package br.com.switchcoin.ConversorDeMoedas.servicos;

import java.util.Map;

public class Conversor {
	
	// Conversao para Dolar
	public double paraUsd(Map<String, Double> tipoMoeda, double valor) {
		return tipoMoeda.get("USD") * valor;
	}
	
	// Conversao para Real Brasileiro
	public double paraBrl(Map<String, Double> tipoMoeda, double valor) {
		return tipoMoeda.get("BRL") * valor;
	}
	
	// Conversao para Peso Argentino
	public double paraArs(Map<String, Double> tipoMoeda, double valor) {
		return tipoMoeda.get("ARS") * valor;
	}	
	
	// Conversao para Peso Chileno
	public double paraClp(Map<String, Double> tipoMoeda, double valor) {
		return tipoMoeda.get("CLP") * valor;
	}	
	
}

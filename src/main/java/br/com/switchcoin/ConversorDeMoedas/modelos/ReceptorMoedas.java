package br.com.switchcoin.ConversorDeMoedas.modelos;

import java.util.Map;

public record ReceptorMoedas(Map<String, Double> conversion_rates) {
}

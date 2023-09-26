package br.com.conversormoedas;

public class ConversorMoedas {

    protected static final Double COTACAO_DOLAR = 5.00;
    protected static final Double COTACAO_EURO = 6.00;
    protected static final Double COTACAO_LIBRA = 7.00;

    public Double converter(Double valor, String moeda) {
        switch (moeda) {
            case "Dólar":
                return valor / COTACAO_DOLAR;
            case "Euro":
                return valor / COTACAO_EURO;
            case "Libra":
                return valor / COTACAO_LIBRA;
            default:
                throw new IllegalArgumentException("Moeda inválida");
        }
    }
}

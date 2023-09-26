package br.com.conversormoedas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // Inicializa o conversor de moedas
        ConversorMoedas conversor = new ConversorMoedas();

        // Laço para repetir a conversão
        boolean continuar = true;
        while (continuar) {
            // Solicita o valor a ser convertido
            System.out.print("Digite o valor em real: ");
            Double valor = scan.nextDouble();

            // Solicita a moeda de destino
            String moeda = solicitarMoeda(scan);

            // Efetua a conversão
            Double valorConvertido = conversor.converter(valor, moeda);

            // Arredonda o valor para duas casas decimais
            long valorConvertidoArredondado = Math.round(valorConvertido * 100);

            // Converte o valor arredondado para Double
            Double valorConvertidoArredondadoDouble = (double) valorConvertidoArredondado / 100;

            // Exibe o resultado da conversão
            System.out.println("O valor convertido para " + moeda + " é " + valorConvertidoArredondadoDouble);

            // Solicita se o usuário deseja continuar
            continuar = solicitarContinuacao(scan);
        }

        // Encerra o programa
        System.out.println("Obrigado por utilizar o conversor de moedas!");
    }

    private static String solicitarMoeda(Scanner scan) {
        String[] moedas = {"Dólar", "Euro", "Libra"};

        System.out.println("Escolha a moeda de destino:");
        for (int i = 0; i < moedas.length; i++) {
            System.out.println(i + 1 + " - " + moedas[i]);
        }

        int opcao = scan.nextInt();
        return moedas[opcao - 1];
    }

    private static boolean solicitarContinuacao(Scanner scan) {
        System.out.print("Deseja continuar? (sim/não): ");
        String resposta = scan.next();

        return resposta.equalsIgnoreCase("sim");
    }
}

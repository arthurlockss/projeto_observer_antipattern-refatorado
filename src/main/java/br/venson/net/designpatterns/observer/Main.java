package br.venson.net.designpatterns.observer;

public class Main {

    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        DisplayTemperatura displayTemp = new DisplayTemperatura();
        DisplayEstatisticas displayStats = new DisplayEstatisticas();
        DisplayUmidade displayUmidade = new DisplayUmidade();

        // 1. Registro dinamico em tempo de execucao
        estacao.registrarObservador(displayTemp);
        estacao.registrarObservador(displayStats);
        estacao.registrarObservador(displayUmidade);

        System.out.println("=== 1a Medicao (Temperatura, Estatisticas e Umidade) ===");
        estacao.setMedicoes(25.0, 60.0, 1013.0);

        System.out.println("\n=== 2a Medicao ===");
        estacao.setMedicoes(27.0, 55.0, 1010.0);

        // 2. Remocao dinamica de um observador
        System.out.println("\n--- Removendo DisplayTemperatura ---");
        estacao.removerObservador(displayTemp);

        System.out.println("\n=== 3a Medicao (Apenas Estatisticas e Umidade) ===");
        estacao.setMedicoes(29.0, 50.0, 1008.0);
    }
}

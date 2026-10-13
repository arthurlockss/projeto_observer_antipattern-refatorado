# Projeto: Estação Meteorológica com Padrão Observer

Estação meteorológica refatorada utilizando o padrão de projeto comportamental **Observer** (GoF) em Java 17 (Maven).

## Arquitetura e Padrão Observer

A refatoração resolve o forte acoplamento do código original através dos seguintes papéis:

- **`Sujeito` (interface):** Declara os métodos para registrar (`registrarObservador`), desregistrar (`removerObservador`) e notificar (`notificarObservadores`) observadores.
- **`Observador` (interface):** Declara o contrato `atualizar(double temperatura, double umidade, double pressao)` que todos os displays devem seguir.
- **`EstacaoMeteorologica` (Sujeito Concreto):** Mantém uma lista dinâmica de observadores e dispara notificações sempre que novas medições são inseridas em `setMedicoes`.
- **Displays (Observadores Concretos):**
  - `DisplayTemperatura`: Exibe a temperatura atual.
  - `DisplayEstatisticas`: Calcula e exibe a média móvel das temperaturas.
  - `DisplayUmidade`: Demonstra a extensibilidade do sistema (OCP), adicionado sem modificar a classe da estação.

## Como Executar

O projeto é compatível com Maven e Java 17+.

- **Linha de comando (com Maven):**
  ```bash
  mvn compile
  java -cp target/classes br.venson.net.designpatterns.observer.Main
  ```

package br.com.fiapride.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LustreComVentilador {

    // Atributos
    public String estrutura;
    public String tamanho;
    public String material;

    // Estado derivado da estrutura
    private int qtdPas;
    private int qtdLampadas;

    public LustreComVentilador(String estrutura, String tamanho, String material) {
        this.estrutura = estrutura;
        this.tamanho = tamanho;
        this.material = material;
        extrairDadosDaEstrutura();
    }

    // Método 1 (NOVO) - altera atributo + validação
    // Atualiza a estrutura e recalcula pás/lâmpadas
    public boolean alterarEstrutura(String novaEstrutura) {
        if (novaEstrutura == null || novaEstrutura.trim().isEmpty()) {
            return false; // inválido
        }

        // precisa ter 2 números na string (pás e lâmpadas)
        int[] dados = extrairNumeros(novaEstrutura);
        if (dados == null) {
            return false; // inválido
        }

        // regras mínimas de consistência (não pode ter negativo)
        if (dados[0] < 0 || dados[1] < 0) {
            return false;
        }

        this.estrutura = novaEstrutura;
        this.qtdPas = dados[0];
        this.qtdLampadas = dados[1];
        return true;
    }

    // Método 2 (NOVO) - altera atributo + validação
    public boolean alterarTamanho(String novoTamanho) {
        if (novoTamanho == null || novoTamanho.trim().isEmpty()) {
            return false;
        }
        this.tamanho = novoTamanho.trim();
        return true;
    }

    // Avaliação (não altera estado)
    public boolean ventila() {
        return qtdPas >= 3;
    }

    public boolean ilumina() {
        return qtdLampadas >= 1;
    }

    public void exibirInformacoes(String nomeLustre) {
        System.out.println("=== " + nomeLustre + " ===");
        System.out.println("Material: " + material);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Quantidade de pás: " + qtdPas);
        System.out.println("Quantidade de lâmpadas: " + qtdLampadas);

        if (ventila() && ilumina()) {
            System.out.println("Status: Ventila e ilumina corretamente.");
        } else {
            System.out.println("Status: NÃO ventila e/ou NÃO ilumina.");
        }
        System.out.println();
    }

    // ---------- Helpers ----------
    private void extrairDadosDaEstrutura() {
        int[] dados = extrairNumeros(this.estrutura);
        if (dados == null) {
            qtdPas = 0;
            qtdLampadas = 0;
        } else {
            qtdPas = Math.max(0, dados[0]);
            qtdLampadas = Math.max(0, dados[1]);
        }
    }

    // extrai os 2 primeiros números encontrados (pás e lâmpadas)
    private int[] extrairNumeros(String texto) {
        if (texto == null) return null;

        Pattern p = Pattern.compile("(\\d+).*?(\\d+)");
        Matcher m = p.matcher(texto);

        if (!m.find()) return null;

        int pas = Integer.parseInt(m.group(1));
        int lamp = Integer.parseInt(m.group(2));
        return new int[]{pas, lamp};
    }
}
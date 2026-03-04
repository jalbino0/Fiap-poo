package br.com.fiapride.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LustreComVentilador {

    public String estrutura;
    public String tamanho;
    public String material;

    private int qtdPas;
    private int qtdLampadas;

    public LustreComVentilador(String estrutura, String tamanho, String material) {
        this.estrutura = estrutura;
        this.tamanho = tamanho;
        this.material = material;
        extrairDadosDaEstrutura();
    }

    public boolean alterarEstrutura(String novaEstrutura) {
        if (novaEstrutura == null || novaEstrutura.trim().isEmpty()) {
            return false; // inválido
        }

        int[] dados = extrairNumeros(novaEstrutura);
        if (dados == null) {
            return false; // inválido
        }

        if (dados[0] < 0 || dados[1] < 0) {
            return false;
        }

        this.estrutura = novaEstrutura;
        this.qtdPas = dados[0];
        this.qtdLampadas = dados[1];
        return true;
    }

    public boolean alterarTamanho(String novoTamanho) {
        if (novoTamanho == null || novoTamanho.trim().isEmpty()) {
            return false;
        }
        this.tamanho = novoTamanho.trim();
        return true;
    }

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

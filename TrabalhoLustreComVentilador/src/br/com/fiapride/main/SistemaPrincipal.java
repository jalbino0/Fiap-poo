package br.com.fiapride.main;

import br.com.fiapride.model.LustreComVentilador;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Teste do LustreComVentilador ---\n");

        LustreComVentilador lustre1 =
                new LustreComVentilador("3 hélices e 2 lâmpadas", "Médio", "Plástico");

        LustreComVentilador lustre2 =
                new LustreComVentilador("1 hélice e 0 lâmpadas", "Pequeno", "Madeira");

        System.out.println("--- Estado Inicial ---");
        lustre1.exibirInformacoes("Lustre 1");
        lustre2.exibirInformacoes("Lustre 2");

        System.out.println("--- Alterando dados com setters ---");
        lustre2.setTamanho("Grande");
        lustre2.setMaterial("Metal");

        System.out.println("\n--- Testando regras de validação ---");
        lustre2.setTamanho("");
        lustre2.setMaterial(null);

        System.out.println("\n--- Estado Final ---");
        lustre1.exibirInformacoes("Lustre 1");
        lustre2.exibirInformacoes("Lustre 2");
    }
}

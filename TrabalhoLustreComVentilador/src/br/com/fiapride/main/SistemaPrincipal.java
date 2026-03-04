package br.com.fiapride.main;

import br.com.fiapride.model.LustreComVentilador;

public class SistemaPrincipal {

    public static void main(String[] args) {

        LustreComVentilador lustre1 =
                new LustreComVentilador("3 hélices e 2 lâmpadas", "Médio", "Plástico");

        LustreComVentilador lustre2 =
                new LustreComVentilador("1 hélices e 0 lâmpada", "Pequeno", "Madeira");

        
        System.out.println("===== ESTADO ORIGINAL =====");
        lustre1.exibirInformacoes("Lustre 1");
        lustre2.exibirInformacoes("Lustre 2");

       
        lustre2.alterarEstrutura("3 hélices e 1 lâmpada");

      
        lustre2.alterarEstrutura(""); 

     
        System.out.println("===== APÓS ALTERAÇÃO DO LUSTRE 2 =====");
       
        lustre1.exibirInformacoes("Lustre 1");
        lustre2.exibirInformacoes("Lustre 2");
    }
}

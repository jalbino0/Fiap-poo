package br.com.fiapride.main;

import br.com.fiapride.model.LustreComVentilador;
import br.com.fiapride.model.MotorVentilador;

public class SistemaPrincipalLustre {

    public static void main(String[] args) {

        System.out.println("--- Teste do LustreComVentilador com Associação ---\n");

        MotorVentilador motor1 = new MotorVentilador("120W", "5 níveis");
        MotorVentilador motor2 = new MotorVentilador("180W", "7 níveis");

        LustreComVentilador lustre1 =
                new LustreComVentilador("3 hélices e 2 lâmpadas", "Médio", "Plástico", motor1);

        LustreComVentilador lustre2 =
                new LustreComVentilador("4 hélices e 3 lâmpadas", "Grande", "Metal", motor2);

        System.out.println("--- Estado Inicial ---");
        lustre1.exibirInformacoes("Lustre 1");
        lustre2.exibirInformacoes("Lustre 2");

        System.out.println("--- Alterando dados do Lustre 2 ---");
        lustre2.atualizarTamanho("Gigante");
        lustre2.atualizarMaterial("Aço Escovado");
        lustre2.atualizarEstrutura("5 hélices e 4 lâmpadas");

        System.out.println("\n--- Alterando dados do Motor 2 ---");
        motor2.atualizarPotencia("200W");
        motor2.atualizarVelocidadeMaxima("8 níveis");

        System.out.println("\n--- Estado Final ---");
        lustre1.exibirInformacoes("Lustre 1");
        lustre2.exibirInformacoes("Lustre 2");

        System.out.println("Acessando dado do objeto associado:");
        System.out.println("Potência do motor do Lustre 2: " 
                + lustre2.getMotorInstalado().getPotencia());
    }
}
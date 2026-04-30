package br.com.fiapride.main;

import br.com.fiapride.model.LustreComVentilador;
import br.com.fiapride.model.LustreComVentiladorResidencial;
import br.com.fiapride.model.LustreComVentiladorSmart;
import br.com.fiapride.model.MotorVentilador;

public class SistemaPrincipalLustre {

    public static void main(String[] args) {

        System.out.println("--- Teste do Objeto Pessoal: LustreComVentilador ---\n");

        MotorVentilador motor1 = new MotorVentilador("120W", "5 níveis");
        MotorVentilador motor2 = new MotorVentilador("180W", "7 níveis");

        LustreComVentilador lustreResidencial =
                new LustreComVentiladorResidencial("3 hélices e 2 lâmpadas", "Médio",
                        "Plástico", motor1, 2);

        LustreComVentilador lustreSmart =
                new LustreComVentiladorSmart("4 hélices e 3 lâmpadas", "Grande",
                        "Metal", motor2, 3, true);

        System.out.println("--- Estado Inicial ---");
        lustreResidencial.exibirInformacoes("Lustre Residencial");
        lustreSmart.exibirInformacoes("Lustre Smart");

        System.out.println("--- Alterando dados do Lustre Smart ---");
        lustreSmart.atualizarTamanho("Gigante");
        lustreSmart.atualizarMaterial("Aço Escovado");
        lustreSmart.atualizarEstrutura("5 hélices e 4 lâmpadas");

        System.out.println("\n--- Alterando dados do Motor do Lustre Smart ---");
        motor2.atualizarPotencia("200W");
        motor2.atualizarVelocidadeMaxima("8 níveis");

        System.out.println("\n--- Estado Final ---");
        lustreResidencial.exibirInformacoes("Lustre Residencial");
        lustreSmart.exibirInformacoes("Lustre Smart");

        System.out.println("--- Teste de Polimorfismo no Objeto Pessoal ---");

        LustreComVentilador[] lustres = {lustreResidencial, lustreSmart};

        for (LustreComVentilador lustre : lustres) {
            System.out.println(lustre.calcularConsumoEnergia());
        }
    }
}

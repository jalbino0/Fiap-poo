package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- FIAPRIDE: Inicializando Sistema ---\n");

        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla");

        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);

        viagemDaAna.exibirResumo();

        System.out.println("--- Adicionando saldo à passageira ---");
        ana.adicionarSaldo(50.0);

        System.out.println("\nSaldo da Ana consultado ATRAVÉS da viagem: R$ "
                + viagemDaAna.getSolicitante().getSaldo());
    }
}

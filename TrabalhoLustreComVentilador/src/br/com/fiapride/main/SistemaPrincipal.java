package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- FIAPRIDE: Inicializando Sistema ---\n");

        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");

        Carro carroDoJoao = new Carro("ABC-1234", "Toyota Corolla", 5);
        Moto motoDaMaria = new Moto("XYZ-9876", "Honda Biz", false);

        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);

        viagemDaAna.exibirResumo();

        System.out.println("--- Adicionando saldo à passageira ---");
        ana.adicionarSaldo(50.0);

        System.out.println("\nSaldo da Ana consultado ATRAVÉS da viagem: R$ "
                + viagemDaAna.getSolicitante().getSaldo());

        System.out.println("\n--- Teste de Herança e Polimorfismo ---");

        carroDoJoao.abastecer(20);
        motoDaMaria.abastecer(10);

        System.out.println(carroDoJoao.calcularAutonomia());
        System.out.println(motoDaMaria.calcularAutonomia());

        System.out.println("\n--- Polimorfismo com referência Veiculo ---");

        Veiculo veiculo1 = carroDoJoao;
        Veiculo veiculo2 = motoDaMaria;

        System.out.println(veiculo1.calcularAutonomia());
        System.out.println(veiculo2.calcularAutonomia());
    }
}

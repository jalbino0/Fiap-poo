package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipalVeiculo {

    public static void main(String[] args) {

        System.out.println("--- Teste da classe Veiculo ---\n");

        Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");

        System.out.println("--- Estado Inicial ---");
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Placa: " + meuCarro.getPlaca());

        System.out.println("\n--- Atualizando Placa ---");
        meuCarro.atualizarPlaca("XYZ-9876");

        System.out.println("\n--- Estado Final ---");
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Placa: " + meuCarro.getPlaca());
    }
}
package br.com.fiapride.model;

public class Viagem {

    private String destino;
    private double valor;
    private Passageiro solicitante;
    private Veiculo veiculoUtilizado;

    public Viagem(String destino, Passageiro solicitante, Veiculo veiculoUtilizado) {
        this.setDestino(destino);
        this.solicitante = solicitante;
        this.veiculoUtilizado = veiculoUtilizado;
        this.setValor(0.0);

        System.out.println("Nova viagem solicitada para: " + this.destino);
    }

    public void exibirResumo() {
        System.out.println("\n--- RESUMO DA VIAGEM ---");
        System.out.println("Destino: " + this.destino);
        System.out.println("Passageiro: " + this.solicitante.getNome());
        System.out.println("Veículo: " + this.veiculoUtilizado.getModelo()
                + " (Placa: " + this.veiculoUtilizado.getPlaca() + ")");
        System.out.println("Valor atual: R$ " + this.valor);
        System.out.println("------------------------\n");
    }

    public String getDestino() {
        return this.destino;
    }

    public double getValor() {
        return this.valor;
    }

    public Passageiro getSolicitante() {
        return this.solicitante;
    }

    public Veiculo getVeiculoUtilizado() {
        return this.veiculoUtilizado;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Erro: o valor da viagem não pode ser negativo.");
        }
    }

    private void setDestino(String destino) {
        if (destino != null && !destino.trim().isEmpty()) {
            this.destino = destino;
        } else {
            System.out.println("Erro: o destino não pode ser vazio.");
        }
    }
}

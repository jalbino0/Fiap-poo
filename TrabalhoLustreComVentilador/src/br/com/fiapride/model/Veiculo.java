package br.com.fiapride.model;

public class Veiculo {

    private String placa;
    private String modelo;
    private double nivelCombustivel;

    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.setModelo(modelo);
        this.setNivelCombustivel(0);
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getNivelCombustivel() {
        return this.nivelCombustivel;
    }

    public void atualizarPlaca(String novaPlaca) {
        System.out.println("Solicitada atualização de placa no Detran para o veículo "
                + this.modelo + ".");
        this.setPlaca(novaPlaca);
    }

    public void abastecer(int quantidade) {
        if (quantidade > 0) {
            this.setNivelCombustivel(this.getNivelCombustivel() + quantidade);
            System.out.println("Abastecimento realizado. Nível atual: "
                    + this.getNivelCombustivel() + " litros.");
        } else {
            System.out.println("Erro: a quantidade de combustível deve ser maior que zero.");
        }
    }

    public String calcularAutonomia() {
        return "Autonomia não definida para um veículo genérico.";
    }

    private void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro: a placa não pode ser vazia.");
        }
    }

    private void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Erro: o modelo não pode ser vazio.");
        }
    }

    private void setNivelCombustivel(double nivelCombustivel) {
        if (nivelCombustivel >= 0) {
            this.nivelCombustivel = nivelCombustivel;
        } else {
            System.out.println("Erro: o nível de combustível não pode ser negativo.");
        }
    }
}

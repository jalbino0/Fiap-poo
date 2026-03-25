package br.com.fiapride.model;

public class Veiculo {

    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.setModelo(modelo);
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void atualizarPlaca(String novaPlaca) {
        this.setPlaca(novaPlaca);
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
}
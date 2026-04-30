package br.com.fiapride.model;

public class MotorVentilador {

    private String potencia;
    private String velocidadeMaxima;

    public MotorVentilador(String potencia, String velocidadeMaxima) {
        this.setPotencia(potencia);
        this.setVelocidadeMaxima(velocidadeMaxima);
    }

    public String getPotencia() {
        return this.potencia;
    }

    public String getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void atualizarPotencia(String novaPotencia) {
        this.setPotencia(novaPotencia);
    }

    public void atualizarVelocidadeMaxima(String novaVelocidadeMaxima) {
        this.setVelocidadeMaxima(novaVelocidadeMaxima);
    }

    private void setPotencia(String potencia) {
        if (potencia != null && !potencia.trim().isEmpty()) {
            this.potencia = potencia;
        } else {
            System.out.println("Erro: a potência não pode ser vazia.");
        }
    }

    private void setVelocidadeMaxima(String velocidadeMaxima) {
        if (velocidadeMaxima != null && !velocidadeMaxima.trim().isEmpty()) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Erro: a velocidade máxima não pode ser vazia.");
        }
    }
}

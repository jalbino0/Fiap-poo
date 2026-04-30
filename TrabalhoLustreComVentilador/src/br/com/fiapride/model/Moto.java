package br.com.fiapride.model;

public class Moto extends Veiculo {

    private boolean eletrica;

    public Moto(String placa, String modelo, boolean eletrica) {
        super(placa, modelo);
        this.eletrica = eletrica;
    }

    public boolean isEletrica() {
        return this.eletrica;
    }

    @Override
    public String calcularAutonomia() {
        double autonomia = this.getNivelCombustivel() * 35;
        return "Autonomia da moto: " + autonomia + " km.";
    }
}

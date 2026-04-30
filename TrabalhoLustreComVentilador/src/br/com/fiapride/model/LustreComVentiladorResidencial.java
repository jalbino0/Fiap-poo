package br.com.fiapride.model;

public class LustreComVentiladorResidencial extends LustreComVentilador {

    private int quantidadeLampadas;

    public LustreComVentiladorResidencial(String estrutura, String tamanho, String material,
                                          MotorVentilador motorInstalado, int quantidadeLampadas) {
        super(estrutura, tamanho, material, motorInstalado);
        this.setQuantidadeLampadas(quantidadeLampadas);
    }

    public int getQuantidadeLampadas() {
        return this.quantidadeLampadas;
    }

    private void setQuantidadeLampadas(int quantidadeLampadas) {
        if (quantidadeLampadas > 0) {
            this.quantidadeLampadas = quantidadeLampadas;
        } else {
            System.out.println("Erro: a quantidade de lâmpadas deve ser maior que zero.");
        }
    }

    @Override
    public String calcularConsumoEnergia() {
        double consumoEstimado = this.getPotenciaMotorEmWatts() + (this.quantidadeLampadas * 9);
        return "Consumo estimado do lustre residencial: " + consumoEstimado + "W.";
    }
}

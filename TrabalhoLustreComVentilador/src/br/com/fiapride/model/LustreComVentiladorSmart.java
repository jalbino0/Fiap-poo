package br.com.fiapride.model;

public class LustreComVentiladorSmart extends LustreComVentilador {

    private int quantidadeLampadas;
    private boolean wifiIntegrado;

    public LustreComVentiladorSmart(String estrutura, String tamanho, String material,
                                    MotorVentilador motorInstalado, int quantidadeLampadas,
                                    boolean wifiIntegrado) {
        super(estrutura, tamanho, material, motorInstalado);
        this.setQuantidadeLampadas(quantidadeLampadas);
        this.wifiIntegrado = wifiIntegrado;
    }

    public int getQuantidadeLampadas() {
        return this.quantidadeLampadas;
    }

    public boolean isWifiIntegrado() {
        return this.wifiIntegrado;
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
        double consumoModuloSmart = this.wifiIntegrado ? 5 : 0;
        double consumoEstimado = this.getPotenciaMotorEmWatts()
                + (this.quantidadeLampadas * 12)
                + consumoModuloSmart;

        return "Consumo estimado do lustre smart: " + consumoEstimado + "W.";
    }
}

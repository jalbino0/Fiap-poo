package br.com.fiapride.model;

public class LustreComVentilador {

    private String estrutura;
    private String tamanho;
    private String material;
    private MotorVentilador motorInstalado;

    public LustreComVentilador(String estrutura, String tamanho, String material, MotorVentilador motorInstalado) {
        this.setEstrutura(estrutura);
        this.setTamanho(tamanho);
        this.setMaterial(material);
        this.motorInstalado = motorInstalado;
    }

    public String getEstrutura() {
        return this.estrutura;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public String getMaterial() {
        return this.material;
    }

    public MotorVentilador getMotorInstalado() {
        return this.motorInstalado;
    }

    public void atualizarEstrutura(String novaEstrutura) {
        this.setEstrutura(novaEstrutura);
    }

    public void atualizarTamanho(String novoTamanho) {
        this.setTamanho(novoTamanho);
    }

    public void atualizarMaterial(String novoMaterial) {
        this.setMaterial(novoMaterial);
    }

    public String calcularConsumoEnergia() {
        return "Consumo não definido para um lustre genérico.";
    }

    protected double getPotenciaMotorEmWatts() {
        if (this.motorInstalado == null || this.motorInstalado.getPotencia() == null) {
            return 0;
        }

        String apenasNumeros = this.motorInstalado.getPotencia().replaceAll("[^0-9.]", "");

        if (apenasNumeros.isEmpty()) {
            return 0;
        }

        return Double.parseDouble(apenasNumeros);
    }

    private void setEstrutura(String estrutura) {
        if (estrutura != null && !estrutura.trim().isEmpty()) {
            this.estrutura = estrutura;
        } else {
            System.out.println("Erro: a estrutura não pode ser vazia.");
        }
    }

    private void setTamanho(String tamanho) {
        if (tamanho != null && !tamanho.trim().isEmpty()) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Erro: o tamanho não pode ser vazio.");
        }
    }

    private void setMaterial(String material) {
        if (material != null && !material.trim().isEmpty()) {
            this.material = material;
        } else {
            System.out.println("Erro: o material não pode ser vazio.");
        }
    }

    public void exibirInformacoes(String nomeLustre) {
        System.out.println("=== " + nomeLustre + " ===");
        System.out.println("Estrutura: " + this.getEstrutura());
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Material: " + this.getMaterial());

        if (this.motorInstalado != null) {
            System.out.println("Potência do motor: " + this.motorInstalado.getPotencia());
            System.out.println("Velocidade máxima do motor: " + this.motorInstalado.getVelocidadeMaxima());
        }

        System.out.println(this.calcularConsumoEnergia());
        System.out.println();
    }
}

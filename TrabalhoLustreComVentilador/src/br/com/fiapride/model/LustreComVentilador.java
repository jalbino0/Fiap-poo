package br.com.fiapride.model;

public class LustreComVentilador {

    private String estrutura;
    private String tamanho;
    private String material;

    public LustreComVentilador(String estrutura, String tamanho, String material) {
        this.setEstrutura(estrutura);
        this.setTamanho(tamanho);
        this.setMaterial(material);
    }

    public String getEstrutura() {
        return this.estrutura;
    }

    public void setEstrutura(String estrutura) {
        if (estrutura != null && !estrutura.trim().isEmpty()) {
            this.estrutura = estrutura;
        } else {
            System.out.println("Erro: a estrutura não pode ser vazia.");
        }
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        if (tamanho != null && !tamanho.trim().isEmpty()) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Erro: o tamanho não pode ser vazio.");
        }
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
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
        System.out.println();
    }
}

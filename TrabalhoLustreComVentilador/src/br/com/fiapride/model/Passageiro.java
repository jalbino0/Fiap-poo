package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor de recarga deve ser maior que zero.");
            return;
        }

        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: R$ " + this.saldo);
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: o custo da viagem é inválido.");
            return;
        }

        if (this.saldo < custo) {
            System.out.println("Erro: saldo insuficiente para realizar a viagem.");
            return;
        }

        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: R$ " + this.saldo);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ser vazio.");
        }
    }

    private void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()) {
            this.cpf = cpf;
        } else {
            System.out.println("Erro: o CPF não pode ser vazio.");
        }
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro: o saldo não pode ser negativo.");
        }
    }
}

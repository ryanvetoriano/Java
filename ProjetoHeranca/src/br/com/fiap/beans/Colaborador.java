package br.com.fiap.beans;

public class Colaborador extends Pessoa{

    private int numeroCracha;

    public Colaborador() {
    }

    public Colaborador(String nome, String cpf, int idade, double renda, int numeroCracha) {
        super(nome, cpf, idade, renda);
        this.numeroCracha = numeroCracha;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    @Override
    public String toString() {
        return "\nColaborador" +
                "\nNúmero do Cracha: " + numeroCracha + super.toString();
    }
}

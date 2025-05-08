package br.com.fiap.beans;

public class Cliente extends Pessoa{

    private String status;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, int idade, double renda, String status) {
        super(nome, cpf, idade, renda);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\n\nCliente" +
                "\nStatus: " + status + super.toString();
    }
}

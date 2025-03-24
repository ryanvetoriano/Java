package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

    public static void main(String[] args) {

        //instanciar obj
        Produto objProduto = new Produto();
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();

        //objProduto
        objProduto.setCodigo(123);
        objProduto.setTipo("refrigerante");
        objProduto.setMarca("Coca-Cola");
        objProduto.setValor(8.99);

        //objCliente
        objCliente.setIdade(18);
        objCliente.setNome("Ryan");
        objCliente.setEmail("vetorianosilva@gmail.com");
        objCliente.setRenda(7.525);

        //objEndereco
        objEndereco.setLogradouro("Av. Paulista");
        objEndereco.setComplemento("Sala 104");
        objEndereco.setBairro("Cidade Tiradentes");
        objEndereco.setCidade("São Paulo");
        objEndereco.setUf("SP");
        objEndereco.setNumero(505);
        objEndereco.setCep("09500-300");

        objCliente.setEndereco(objEndereco);

        //saídas
        System.out.println("Codigo: " +objProduto.getCodigo() +
                "\nTipo: " + objProduto.getTipo() +
                "\nMarca: " + objProduto.getMarca() +
                "\nValor: " + objProduto.getValor()
        );

        System.out.println("Idade: " + objCliente.getIdade() +
                "\nNome: " + objCliente.getNome() +
                "\nEmail: " + objCliente.getEmail() +
                "\nRenda: " + objCliente.getEmail() +
                "\n\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                "\nBairro: " + objCliente.getEndereco().getBairro() +
                "\nNumero: " + objCliente.getEndereco().getNumero() +
                "\nComplemento: " + objCliente.getEndereco().getComplemento() +
                "\nUF: " + objCliente.getEndereco().getUf() +
                "\nCEP: " + objCliente.getEndereco().getCep() +
                "\nCidade: " + objCliente.getEndereco().getCidade());

    }
}

package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

    public static void main(String[] args) {

        // instanciar objetos
        Produto objProduto = new Produto();
        Endereco objEndereco = new Endereco();
        Cliente objCliente = new Cliente();

        // Entradas do Produto
        objProduto.setCodigo(123);
        objProduto.setTipo("Mouse");
        objProduto.setMarca("Dell");
        objProduto.setValor(55.45);

        // Entradas do Cliente
        objCliente.setIdade(41);
        objCliente.setNome("Clotilde");
        objCliente.setEmail("clotilde@gmail.com");
        objCliente.setRenda(8.745);

        objEndereco.setLogradouro("Rua Apito do Vapor");
        objEndereco.setNumero(295);
        objEndereco.setComplemento("Casa");
        objEndereco.setCep("08485-440");
        objEndereco.setBairro("Cid Tiradentes");
        objEndereco.setCidade("São Paulo");

        objCliente.setEndereco(objEndereco);

        // Saidas
        System.out.println("INFORMAÇÕES DO PRODUTO" +
                "\nCodigo: " + objProduto.getCodigo() +
                "\nTipo: " + objProduto.getTipo() +
                "\nMarca: " + objProduto.getMarca() +
                "\nValor: " + objProduto.getValor() +
                "\n\nINFORMAÇÕES DO CLIENTE" +
                "\nIdade: " + objCliente.getIdade() +
                "\nNome: " + objCliente.getNome() +
                "\nEmail: " + objCliente.getEmail() +
                "\nRenda: " + objCliente.getRenda() +
                "\nENDEREÇO" +
                "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                "\nNumero: " + objCliente.getEndereco().getNumero() +
                "\nComplemento: " + objCliente.getEndereco().getComplemento() +
                "\nCEP: " + objCliente.getEndereco().getCep() +
                "\nBairro: " + objCliente.getEndereco().getBairro() +
                "\nCidade: " + objCliente.getEndereco().getCidade()

        );


    }
}

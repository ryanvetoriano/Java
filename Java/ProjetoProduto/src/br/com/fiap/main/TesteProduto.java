package br.com.fiap.main;

import br.com.fiap.beans.Produto;

public class TesteProduto {

    public static void main(String[] args) {

        Produto objProduto = new Produto();

        //Entradas
        objProduto.setCodigo(123);
        objProduto.setTipo("refrigerante");
        objProduto.setMarca("Coca-cola");
        objProduto.setValor(8.50);

        //Saídas
        System.out.println("Código: " + objProduto.getCodigo() +
                "\nTipo: " + objProduto.getTipo() +
                "\nMarca: " + objProduto.getMarca() +
                "\nValor: " + objProduto.getValor() );
    };
};

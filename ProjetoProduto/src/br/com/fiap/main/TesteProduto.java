package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteProduto {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int numero(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double quebrado(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        Produto objProduto = new Produto();

        objProduto.setCodigo(numero("Digite o código do produto:"));
        objProduto.setMarca(texto("Digite a marca do produto:"));
        objProduto.setTipo(texto("Digite o tipo de produto:"));
        objProduto.setQuantidade(numero("Digite a quantidade:"));
        objProduto.setValor(quebrado( "Digite o valor do produto:"));

        System.out.println(objProduto);
        System.out.println("Valor Total: " + objProduto.calcularTotal());

    }

}

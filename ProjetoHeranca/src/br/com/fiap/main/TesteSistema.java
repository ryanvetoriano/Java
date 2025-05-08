package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;

import javax.swing.*;

public class TesteSistema {

    static String texto (String s) {
        return JOptionPane.showInputDialog(s);
    }

    static int inteiro (String i) {
        return Integer.parseInt(JOptionPane.showInputDialog(i));
    }

    static double real (String d) {
        return Double.parseDouble(JOptionPane.showInputDialog(d));
    }

    public static void main(String[] args) {

        Cliente objCliente = new Cliente(
                texto("Nomde do Cliente"),
                texto("Cpf"),
                inteiro("Idade do Cliente"),
                real("Renda do Cliente"),
                texto("Status do Cliente")
        );


        Colaborador objColaborador = new Colaborador(
                texto("Nome do Colaborador"),
                texto("Cpf do Colaborador"),
                inteiro("Idade do Colaborador"),
                real("Renda do Colaborador"),
                inteiro("Número do Cracha")
        );

    }

}

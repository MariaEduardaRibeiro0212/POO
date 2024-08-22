/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.CincoCompras;
import javax.swing.JOptionPane;

/**
 *
 * @author maria.gabriel
 */
public class ObjetoCompra {
    public static void main(String[] args) {
        CincoCompras c = new CincoCompras();
        int cont;
        
        for(cont = 1; cont <= 5; cont++){
        c.setCompra(Double.valueOf(JOptionPane.showInputDialog("Digite o valor da " + cont + "º compra: ")));
        }
        JOptionPane.showInternalMessageDialog(null, "Somatório das compras: " + c.somatorio());
        JOptionPane.showInternalMessageDialog(null, "O valor da maior compra feita: " + c.maiorCompra());
    }
}
/*Faça um programa que receba como dados de entrada duas notas de 10 alunos e mostre como resultado:
a) Qual foi a maior média da turma;
b) Qual foi a menor média da turma;
c) Qual foi a média da turma;*/
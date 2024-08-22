/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Semestre;
import javax.swing.JOptionPane;

public class MeuQueridoObjeto {
    public static void main(String[] args) {
        Semestre s = new Semestre();
        int cont;
        
        for(cont = 1; cont < 3; cont++){
            
       s.setValor1(Double.valueOf(JOptionPane.showInputDialog("Digite um valor da : ")));
       JOptionPane.showMessageDialog(null, "Valor: " + s.getValor1());
       JOptionPane.showMessageDialog(null, "Dobro: " + s.dobro());  
       
        } 
    }
}
/*Faça um programa que receba como dados de entrada o valor de cinco compras e mostre como resultado:
a) A soma de todas as compras;
b) A maior compra efetuada.*/
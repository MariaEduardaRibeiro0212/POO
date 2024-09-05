/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Compras;
import javax.swing.JOptionPane;

public class VisaoCompras {
    public static void main(String[] args) {
        Compras c = new Compras();
       int cont;
     c.setNumComprasRegistradas(Integer.valueOf(JOptionPane.showInputDialog("Informe quantas compras deseja registrar:")));
        
    
    for(cont = 1; cont <= c.getNumComprasRegistradas(); cont++){
    c.setCompras(Double.valueOf(JOptionPane.showInputDialog("Digite o valor da " + cont + "º Compra:")));
}
   JOptionPane.showInternalMessageDialog(null, "O somatório das compras é: " + c.getSoma());
   JOptionPane.showInternalMessageDialog(null, "O número de compras efetivadas com o valor entre R$500,00 e R$700,00: " + c.getQtdCompras()+ " Compra(s).");
    }
 
}

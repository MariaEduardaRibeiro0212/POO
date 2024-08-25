/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.DezAlunos;
import javax.swing.JOptionPane;

public class Objeto10Alunos {
    public static void main(String[] args) {
        DezAlunos d = new DezAlunos();
        
        int cont;
        
        for(cont = 1; cont <= 3; cont++){
          d.setNota1(Double.valueOf(JOptionPane.showInputDialog("Digite a nota do primeiro semestre: ")));
          d.setNota2(Double.valueOf(JOptionPane.showInputDialog("Digite a nota do segundo semestre: ")));
          
        }
        
        JOptionPane.showMessageDialog(null, "A média da turma é" + d.getMediaT()/3);
        JOptionPane.showMessageDialog(null, "A maior nota é " + d.getMaiorMedia());
        JOptionPane.showMessageDialog(null, "A menor nota é " + d.getMenorMedia());
        
    }
    
}

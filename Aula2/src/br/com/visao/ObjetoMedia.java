/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;
import br.com.controle.MediaAluno;
import javax.swing.JOptionPane;

public class ObjetoMedia {
    public static void main(String[] args) {
        
        MediaAluno m = new MediaAluno();
        
        m.setNota1(Double.valueOf(JOptionPane.showInputDialog("Digite a 1º nota:")));
        m.setNota2(Double.valueOf(JOptionPane.showInputDialog("Digite a 2º nota:")));
        
        JOptionPane.showMessageDialog(null, "A média do aluno é " + m.CalcularMedia());
        
        if(m.CalcularMedia() >= 7){
         
        JOptionPane.showMessageDialog(null, "Situação: Aprovado ");   
        } else{
            
        JOptionPane.showMessageDialog(null, "Situação: Reprovado "); 
        
        }
    }
}

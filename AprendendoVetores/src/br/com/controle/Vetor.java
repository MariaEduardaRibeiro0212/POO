/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vetor {
    public static void main(String[] args){
        int codigo;
        String nome = null;
        int idade = 0;
        int cont;
        
        ArrayList<String> cadastro = new ArrayList<>();
        
        for(cont = 0; cont < 3; cont++){
            codigo = Integer.valueOf(JOptionPane.showInputDialog("Digite o código:"));
            nome = JOptionPane.showInputDialog("Digite o nome: ");
            idade = Integer.valueOf(JOptionPane.showInputDialog("Digite a idade: "));
            
            cadastro.add(String.valueOf(codigo));
            cadastro.add(nome);
            cadastro.add(String.valueOf(idade));
           
        } 
          
        JOptionPane.showMessageDialog(null, cadastro.toString());
         
    }
}

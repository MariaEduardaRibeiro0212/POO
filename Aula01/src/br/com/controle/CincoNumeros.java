/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import javax.swing.JOptionPane;

/*Programa  que recebe 5 número e retorna o somatório dos números e o maior número da sequência
 */
public class CincoNumeros {
    public static void main(String[] args) {
        int numero, i, maior,somatorio = 0;
        
        maior = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o 1º número: "));
        somatorio = maior;
        
        for(i = 2;i <= 5; i++){
            
                    
        numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o " + i +"º número:"));
        
        somatorio+=numero;
        
        if(numero > maior){
            maior = numero;
        }
        }
        JOptionPane.showMessageDialog(null, "O maior número da sequência é "+ maior);
        JOptionPane.showMessageDialog(null, "O somatório da sequência é "+ somatorio);

    }
}
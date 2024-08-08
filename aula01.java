/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import javax.swing.JOptionPane;

/*Faça um programa que receba como dados de entrada 5 números inteiros e mostre como resultado:
a) A soma dos número digitados;
b) Qual foi o maior número digitado.

OBS: Não utilizar vetor e utilizar no máximo quatro variáveis.*/

public class CincoNumeros {
    public static void main(String[] args) {
        int numero, i, maior;
        
        for(i = 0; i <= 5; i++){
                    
        numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite um número: "));
        
        if(maior > numero){
            maior = numero;
        }
        }
          
    }
  
}

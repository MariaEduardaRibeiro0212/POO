/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Enquete {
    private int opcao1;
    private int opcao2;
    private String nome;
    int soma1;
    int soma2;

    public int getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(int opcao) {
        this.opcao1 = opcao;
        soma1++;
    }

    public int getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(int opcao2) {
        this.opcao2 = opcao2;
        soma2++;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int somatorio1(){
        return soma1;
    }
    
    public int somatorio2(){
        return soma2;
    }

  
    
}

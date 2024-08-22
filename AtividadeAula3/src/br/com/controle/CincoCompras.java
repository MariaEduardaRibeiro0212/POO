/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/*Faça um programa que receba como dados de entrada o valor de cinco compras e mostre como resultado:
a) A soma de todas as compras;
b) A maior compra efetuada.*/
public class CincoCompras {
    private double compra;
    private double maior;
    private double soma;

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
        
        if (this.compra > this.maior){  
        this.maior = this.compra;
        }
        this.soma += this.compra;
    }

    public double getMaior() {
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
    
    
    public double maiorCompra(){
 
        return this.maior;
    }
    
    public double somatorio(){

        return this.soma;
    }
}

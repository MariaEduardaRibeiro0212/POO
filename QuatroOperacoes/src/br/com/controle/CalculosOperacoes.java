/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class CalculosOperacoes {
    private double valor1;
    private double valor2;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double calcularSoma(){
        return this.valor1 + this.valor2;
    }
    
    public double calcularSub(){
        return this.valor1 - this.valor2;
    }
    
    public double calcularMult(){
        return this.valor1*this.valor2;
    }
    
    public double calcularDiv(){
        return this.valor1/this.valor2;
    }
    
}
